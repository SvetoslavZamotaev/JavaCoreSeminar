package backend;

import backend.filework.FileWorker;

import java.util.Scanner;

public class Mainmenu {
    protected static boolean status = true;



    public static void menu(){
        while(status) {
            System.out.println("==================================================");
            System.out.println("Hello user! do you want to add some note to file?");
            System.out.println("if 'yes' choose 1 if u want close app choose 0!  ");
            System.out.println("if you want read file choose 2!");
            System.out.println("===================================================");
            Scanner scan = new Scanner(System.in);
            int key = scan.nextInt();
            switch (key) {
                case (1):
                    System.out.println("Write something to note");
                    Scanner scan2 = new Scanner(System.in);
                    String message;
                    message = scan2.nextLine();
                    try {
                        FileWorker.WriteToFile(Decorator.Decorate(message));
                    }
                    catch (Exception e){
                        System.out.println("Sorry file not found or you didn't write anything in console");
                    }
                    break;
                case (0):
                    MenuOff();
                    break;

                case (2):
                    try {
                        FileWorker.ReadFromFile();
                    }
                    catch (Exception e){
                        System.out.println("Sorry file not found or you didn't write anything in console");
                    }
                    break;
            }

        }
    }
    public static void MenuOff(){
        status = false;
    }





}
