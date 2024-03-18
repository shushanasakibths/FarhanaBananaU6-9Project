import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGame extends JFrame {
    private JLabel label;
    private JButton choice1;
    private JButton choice2;

    public MainGame(){
        setTitle("Episode");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel();
        choice1 = new JButton();
        choice2 = new JButton();
        choice1.setPreferredSize(new java.awt.Dimension(150, 150));
        choice2.setPreferredSize(new java.awt.Dimension(150, 150));

        //layout
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);

        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(choice1);
        panel1.add(choice2);
        add(panel1, BorderLayout.SOUTH);



    }
}
