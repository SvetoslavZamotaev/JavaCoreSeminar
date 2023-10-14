package server.server;

import server.client.Client;
import server.client.ClientGUI;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ServerItself {


    private boolean work;



    List<ClientGUI> clientGUIList;


    ServerWindow serverWindow;
    Logger data;


    public ServerItself( ServerWindow serverWindow){


        this.work = true;
        clientGUIList = new ArrayList<>();
        data = new StorageFiles();
    }

    public boolean isserverwork(){
        return this.work;
    }

    public void changeStatus(boolean status){
        this.work = status;
    }




    public boolean connectUser(Client client){
        if (!work){
            return false;
        }
        clientGUIList.add(client);
        return true;
    }


    public List<ClientGUI> getClientGUIList() {
        return clientGUIList;
    }

    public void disconnectUser(Client clientGUI){
        clientGUIList.remove(clientGUI);
        if (clientGUI != null){
            clientGUI.disconnectFromServer();
        }
    }


    public void sendMessage(String text){
        if (!work){
            return;
        }
//        text += "";

        answerAll(text);
        data.saveInLog(text);
    }

    private void answerAll(String text){
        for (ClientGUI clientGUI: clientGUIList){
            clientGUI.answer(text);
        }
    }













}
