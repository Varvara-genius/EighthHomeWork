import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 200, 300, 400);

        JTextArea filed = new JTextArea();
        add(filed, BorderLayout.CENTER);
        filed.setEnabled(false);
        JPanel panel = new JPanel();
        add(panel, BorderLayout.SOUTH);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        JTextField filed2 = new JTextField();
        JButton send = new JButton("Send");
        panel.add(filed2);
        panel.add(send);

        send.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 1) {

                    filed.append(filed2.getText() + "\n");
                    System.out.println(filed2.getText());
                    filed2.setText("");

                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setVisible(true);

    }
}
