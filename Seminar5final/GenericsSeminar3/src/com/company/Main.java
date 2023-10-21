package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Calculator.sum(2.2, 1);
        Calculator.subtract(1.1, 2);
        Calculator.divide(2, 2.4f);
        Calculator.multiply(3.2f, 4);

        Integer[] a = {1, 2, 3, 4};
        Integer[] b = {1, 2, 3, 4};
        Integer[] c = {1, 3, 4, 5};

        Calculator calc = new Calculator();

        try {
            System.out.println(calc.compareArrays(a, b));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Double first = 2.3;
        String second = "Second variable";

        Pair pair = new Pair(first , second);

        System.out.println(pair.getFirst() + ""+ pair.getSecond());
        System.out.println(pair.toString());


    }
}
