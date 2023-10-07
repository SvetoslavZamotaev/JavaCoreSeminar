import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
    private static final int WIDTH = 555;
    private static final int HEIGHT = 507;

    JButton startserver;
    JButton stopserver;

    static JTextArea logServer;
    JTextArea serverstatus;

    private static boolean isServerWorking;


    MainMenu(){
        setTitle("Chat Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocation(500,300);
        setResizable(false);
        serverstatus = new JTextArea();

        add(serverstatus,BorderLayout.NORTH);
        logServer = new JTextArea();
        add(logServer,BorderLayout.CENTER);

        JPanel panelbottom = new JPanel(new GridLayout(1,2));

        startserver = new JButton("Start");
        stopserver = new JButton("Stop");



        startserver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isServerWorking==true){
                    serverstatus.setText("server is already on");

                }
                else {
                new SettingsAndRun();
                MainMenu.setIsServerWorking(1);
                serverstatus.setText("server is on");;
                }
            }
        });


        stopserver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking == false){
                    System.out.println();
                    serverstatus.setText("server is already stopped");
                }
                else{
                    System.out.println();
                    serverstatus.setText("server is stopped");
                MainMenu.setIsServerWorking(0);
                }
            }
        });


        panelbottom.add(startserver);
        panelbottom.add(stopserver);
        add(panelbottom, BorderLayout.SOUTH);

        setVisible(true);


    }

    public static void setIsServerWorking(int oneOrZero){
        if (oneOrZero==1){
            isServerWorking=true;
        }
        if(oneOrZero==0){
            isServerWorking=false;
        }
    }

    public static void showChat(String message){
        logServer.append(message);
    }




}
