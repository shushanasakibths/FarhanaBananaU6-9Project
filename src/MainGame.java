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
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel();
        choice1 = new JButton();
        choice2 = new JButton();

        //layout
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);

        JPanel panel1 = new JPanel(new GridLayout(1, 2));
        panel1.add(choice1);
        panel1.add(choice2);
        add(panel1, BorderLayout.SOUTH);



    }
}
