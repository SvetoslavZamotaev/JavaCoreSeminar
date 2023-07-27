

public class Buyer {
    private String fio;

    private int age;

    private int phone;

    public Buyer(){
        // empty constructor for customerExeption.
    }

    public Buyer(String fio, int age, int phone) {
        this.fio = fio;
        this.age = age;
        this.phone = phone;
    }

    public boolean buyerHaveNull(){
        if(this.fio == null || this.age==0 || this.phone == 0){
            return true;
        }
        return false;
    }
}