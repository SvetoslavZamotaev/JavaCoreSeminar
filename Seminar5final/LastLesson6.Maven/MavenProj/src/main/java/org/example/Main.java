package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TypeOfGame type = new TypeOfGame(new Host());
        type.WithoutChangeSelection();

        TypeOfGame type2 = new TypeOfGame(new Host());
        type2.WithChangeSelection();

        type.StatisticWins();
        type2.StatisticWins();
    }
}
