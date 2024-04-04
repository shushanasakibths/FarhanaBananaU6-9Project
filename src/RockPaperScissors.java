import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class RockPaperScissors extends JFrame implements ActionListener {
    private JLabel result;
    private int playerScore;
    private int computerScore;

    public RockPaperScissors(){
        setTitle("Rock, Paper, Scissors");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton rock = new JButton("Rock");
        rock.addActionListener(this);
        panel.add(rock);

        JButton paper = new JButton("Paper");
        paper.addActionListener(this);
        panel.add(paper);

        JButton scissors = new JButton("Scissors");
        scissors.addActionListener(this);
        panel.add(scissors);

        result = new JLabel("Score: ");
        panel.add(result);
        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String player = e.getActionCommand();
        String computer = compChoice();

        String res = determineWin(player, computer);
        JOptionPane.showMessageDialog(this, "Computer chose: " + computer + "\n" + res);
        if(res.equals("You win!!")){
            playerScore++;
        } else if(res.equals("Computer wins!")){
            computerScore++;
        }
        result.setText("Score: You " + playerScore + " - " + computerScore + " Computer");
    }

    private String compChoice(){
        String[] choices = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        int idx = random.nextInt(choices.length);
        return choices[idx];
    }

    private String determineWin(String player, String computer){
        if (player.equals(computer)){
            return "It's a tie! You both win!!";
        } else if((player.equals("Rock") && computer.equals("Scissors")) ||
                (player.equals("Paper") && computer.equals("Rock")) ||
                (player.equals("Scissors") && computer.equals("Paper"))){
            return "You win!!";
        } else{
            return "Computer wins!";
        }
    }

    public static void main(String[] args) {
        new RockPaperScissors();
    }
}
