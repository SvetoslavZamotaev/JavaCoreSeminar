import java.net.*;
import java.io.*;

public class SimpleServer {



        SimpleServer(){


        try {


            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Сервер запущен на порту 8080");
            while (true) {

                Socket clientSocket = serverSocket.accept();

//
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                String clientMessage = reader.readLine();

                System.out.println(clientMessage);


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
}