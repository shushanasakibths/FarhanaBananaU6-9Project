//MAKE A BOT TO PLAY AGAINST PLAYER -> EPISODE IS A ONE PERSON GAME
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe implements ActionListener {
    private JFrame frame;
    private JButton[] buttons = new JButton[9];
    private JPanel panel;
    private boolean xPlayerTurn = true;

    public TicTacToe(){
        frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.setLayout(new GridLayout(3, 3));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for(int i = 0; i < 9; i++){
            buttons[i] = new JButton();
            buttons[i].setFont(new Font("Inria Sans", Font.PLAIN, 40));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        if (xPlayerTurn){
            button.setText("X");
        }else{
            button.setText("O");
        }
        button.setEnabled(false);
        xPlayerTurn = !xPlayerTurn;
        winnerCheck();
    }


    public void winnerCheck(){
        //rows
        for (int i = 0; i < 9; i += 3){
            if(buttons[i].getText().equals(buttons[i + 1].getText())
                    && buttons[i].getText().equals(buttons[i + 2].getText())
                    && !buttons[i].isEnabled()){
                JOptionPane.showMessageDialog(frame, buttons[i].getText() + " wins!!");
                reset();
                return;
            }
        }

        //columns
        for (int i = 0; i < 3; i++){
            if(buttons[i].getText().equals(buttons[i + 3].getText())
                    && buttons[i].getText().equals(buttons[i + 6].getText())
                    && !buttons[i].isEnabled()){
                JOptionPane.showMessageDialog(frame, buttons[i].getText() + " wins!!");
                reset();
                return;
            }
        }

        //diagonals
        if(buttons[0].getText().equals(buttons[4].getText())
                && buttons[0].getText().equals(buttons[8].getText())
                && !buttons[0].isEnabled()){
            JOptionPane.showMessageDialog(frame, buttons[0].getText() + " wins!!");
            reset();
            return;
        }
        if(buttons[2].getText().equals(buttons[4].getText())
                && buttons[2].getText().equals(buttons[6].getText())
                && !buttons[2].isEnabled()){
            JOptionPane.showMessageDialog(frame, buttons[2].getText() + " wins!!");
            reset();
            return;
        }

        //tie
        boolean tie = true;
        for(int i = 0; i < 9; i++){
            if(buttons[i].isEnabled()){
                tie = false;
                break;
            }
        }
        if(tie){
            JOptionPane.showMessageDialog(frame, "Tie game!!");
            reset();
        }
    }

    public void reset(){
        for(int i = 0; i < 9; i++){
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
        xPlayerTurn = true;
    }

    public static void main(String[] args) {
        new TicTacToe();
    }

}
