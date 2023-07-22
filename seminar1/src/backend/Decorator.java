package backend;


import java.util.Date;

public class Decorator {

    public static String Decorate(String message){
        Date date = new Date();
        String result = date + " " + message;
        return result;
    }

}
