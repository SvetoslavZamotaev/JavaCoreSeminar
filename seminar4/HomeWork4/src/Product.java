public class Product {

    private String name;

    private int price;


    public Product(){
        //for ProductException
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public boolean productHaveNull(){
        if(this.name == null || this.price == 0){
            return true;
        }
        return false;
    }

}