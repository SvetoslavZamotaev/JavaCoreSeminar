package server.server;

import server.client.ClientGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;


    JButton btnStart, btnStop;
    JTextArea log;

    ServerItself serverItself;





    public ServerWindow(){
        serverItself = new ServerItself(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);

        createPanel();

        setVisible(true);
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private void appendLog(String text){
        log.append(text + "\n");
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (serverItself.isserverwork()){
                    appendLog("Сервер уже был запущен");
                } else {
                    serverItself.changeStatus(true);
//                    work = true;
                    appendLog("Сервер запущен!");
                }
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!serverItself.isserverwork()){
                    appendLog("Сервер уже был остановлен");
                } else {
//                    work = false;
                    serverItself.changeStatus(false);
                    for (ClientGUI clientGUI: serverItself.getClientGUIList()){
                        disconnectUser(clientGUI);
                    }
                    //TODO поправить удаление
                    appendLog("Сервер остановлен!");
                }
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }
}
