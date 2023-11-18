package org.example;

import java.util.HashMap;

public class TypeOfGame {
    private Host host;
    private HashMap<Integer,Boolean> result;

    TypeOfGame(Host host){
        this.host = host;
        result = new HashMap<>();
    }

    public void WithoutChangeSelection(){
        for (int i = 1; i <1001 ; i++) {
            host.make3doorsAndPrice();
            host.PlayersChoose();
            host.deleteDoor();
            if(host.checkIfPlayerWin()){
                result.put(i, true);
                continue;
            }
            result.put(i,false);
        }
    }

    public void WithChangeSelection(){
        for (int i = 1; i <1001 ; i++) {
            host.make3doorsAndPrice();
            host.PlayersChoose();
            host.deleteDoor();
            host.SecondChoose();
            if(host.checkIfPlayerWin()){
                result.put(i, true);
                continue;
            }
            result.put(i,false);
        }
    }

    public void StatisticWins(){
        HashMap<Integer,Boolean> list = result;
        int counter = 0;
        for (int i = 1; i < 1001; i++) {
            if(list.get(i)){
                counter++;
            }
        }
        float result = ((float) counter/(float) 1000)*(float) 100;
        System.out.println("[ win percentage: "+result +" , "+ counter +" wins out of 1000 iterations ]");
    }
}
