import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client{

        Client(){

            while (true){

                try(Socket socket = new Socket("127.0.0.1",8080)){

                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                    Scanner scan = new Scanner(System.in);

                    String message = scan.nextLine();

                    writer.write(message);
                    writer.newLine();
                    writer.flush();



                }catch(IOException e){
                    e.printStackTrace();
                }
        }}
}