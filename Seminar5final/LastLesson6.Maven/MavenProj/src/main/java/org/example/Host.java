package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Host {
    private ArrayList<Integer> doors;
    private int winDoor;
    private Random rand;
    private int playerChoice;

    Host(){
        rand = new Random();
    }

    public void make3doorsAndPrice() {
        doors = new ArrayList(Arrays.asList(1,2,3));
        winDoor = rand.nextInt(3)+1;
    }

    public void PlayersChoose(){
        playerChoice = rand.nextInt(3)+1;
    }

    public void SecondChoose(){
        for (int i = 0; i < doors.size(); i++) {
            if(doors.get(i)!=playerChoice){
                playerChoice = doors.get(i);
            }
        }
    }

    boolean checkIfPlayerWin(){
        if(playerChoice == winDoor){
            return true;
        }
        return false;
    }

    public void deleteDoor(){
        int targetIndex = 0;
        for (int i = 0; i < doors.size(); i++) {
            if(doors.get(i)!= winDoor){
                targetIndex = i;
            }
        }
        doors.remove(targetIndex);
    }

}
