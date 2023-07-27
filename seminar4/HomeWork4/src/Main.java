import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Buyer[] buyers = new Buyer[2];
        buyers[0] = new Buyer("John Wick",55,678899);
        buyers[1] = new Buyer("Nickolas Cage", 50 , 34545);

        Product[] products = new Product[5];
        products[0] = new Product("bread" , 35);
        products[1] = new Product("water" , 40);
        products[2] = new Product("iphone 14",80000);
        products[3] = new Product("condoms", 450);
        products[4] = new Product("Wine" , 3400);

        Order[] orders = new Order[5];
        Random rand = new Random();

        for (int i = 0; i < orders.length ; i++) {
            try {
                orders[i] = Order.OrderProcess(buyers[rand.nextInt(1)],products[i],1);
            } catch (CustomerException e) {
                e.printStackTrace();
            } catch (AmountException a){
                a.printStackTrace();
            } catch (ProductException p){
                p.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Testing Exceptions

        Buyer emptyBuyer = new Buyer();
        Product emptyProduct = new Product();

        Order[] badOrders = new Order[3];


        try {
//            badOrders[0] = Order.OrderProcess(emptyBuyer,products[2],1);
//            badOrders[1] = Order.OrderProcess(buyers[1],emptyProduct,1);
            badOrders[2] = Order.OrderProcess(buyers[1],products[2],133);
        }
        catch (CustomerException c){
            c.printStackTrace();
            throw new RuntimeException("App stopped , buyer have invalid data");
        }
        catch (ProductException p){
            System.out.println("pls do not trade , product error");
        }
        catch (AmountException a){
            System.out.println(" Amount exception Work");
            Order fixingOrder = new Order(buyers[1],products[2],1);
        }
        catch (IOException e){
            System.out.println(" IOexception");
        }

        Order.showOrders();

    }
}