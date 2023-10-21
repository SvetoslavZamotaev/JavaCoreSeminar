package com.company;

import java.io.IOException;

public class Calculator {



    public static <T extends Number, K extends Number> void sum(T a , K b){
        System.out.println(a.doubleValue()+b.doubleValue());
    }



    public static <T extends Number, K extends Number> void multiply(T a , K b){
        System.out.println(a.doubleValue()*b.doubleValue());
    }

    public static <T extends Number, K extends Number> void divide(T a , K b){
        System.out.println(a.doubleValue()/b.doubleValue());
    }

    public static <T extends Number, K extends Number> void subtract(T a , K b){
        System.out.println(a.doubleValue()-b.doubleValue());
    }

    public <A> boolean compareArrays(A[] a , A[] b) throws IOException {
        boolean result = true;
        if(a.length != b.length){
            throw new IOException("Size of arrays is not equal!");
        }
        for (int i = 0; i < a.length ; i++) {
            if(!a[i].equals(b[i])){
                result = false;
            }
        }
        return result;
    }




}
