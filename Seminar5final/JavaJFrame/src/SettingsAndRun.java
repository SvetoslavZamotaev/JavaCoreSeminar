import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsAndRun extends JFrame {
    private static final int WIDTH = 555;
    private static final int HEIGHT = 507;


    JTextField ip = new JTextField("ip address");
    JTextField port = new JTextField("port");
    JTextArea emptyArea= new JTextArea();
    JTextField name = new JTextField("name and surname");
    JPasswordField pass = new JPasswordField("pass");
    JButton login = new JButton("Login");


    JTextField sendtextarea = new JTextField("write message");
    JButton send = new JButton("Send");

    JTextArea middleTextArea = new JTextArea();






    public SettingsAndRun(){
        setTitle("Chat Client");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocation(900,300);
        setResizable(false);


        JPanel paneltop = new JPanel(new GridLayout(2,3));
        JPanel panelBottom = new JPanel(new BorderLayout());
        panelBottom.add(sendtextarea,BorderLayout.CENTER);
        panelBottom.add(send,BorderLayout.EAST);
        add(panelBottom,BorderLayout.SOUTH);
        add(middleTextArea,BorderLayout.CENTER);

        paneltop.add(ip);
        paneltop.add(port);
        paneltop.add(emptyArea);
        paneltop.add(name);
        paneltop.add(pass);
        paneltop.add(login);
        add(paneltop,BorderLayout.NORTH);
        setVisible(true);

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                middleTextArea.setText(name.getText()+ " said " + sendtextarea.getText()+"\n");
                MainMenu.showChat(name.getText()+ " said " + sendtextarea.getText()+"\n");
            }
        });

    }

}
