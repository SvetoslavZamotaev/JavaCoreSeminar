import java.io.IOException;

public class Order {

    private static int ordercount = 0;

    private Buyer buyer;

    private Product product;

    private int quantity;

    public Order(Buyer buyer, Product product, int quantity) {
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }


    public static void newOrder(){
        ordercount = ordercount+1;
    }

    public static void showOrders(){
        System.out.println("we have "+ ordercount + " today.");
    }

    public static Order OrderProcess(Buyer buyer , Product product , int quantity) throws IOException{
        if(  quantity > 100 || quantity < 1){
            throw new AmountException();
        }
        if(buyer.buyerHaveNull()){
            throw new CustomerException();
        }
        if(product.productHaveNull()){
            throw new ProductException();
        }

        newOrder();
        return new Order(buyer,product,quantity);
    }

    public void changeQuantity(){
        this.quantity = 1;
    }




}