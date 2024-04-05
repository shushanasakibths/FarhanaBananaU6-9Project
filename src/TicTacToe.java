import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TicTacToe implements ActionListener {
    private JFrame frame;
    private JButton[] buttons = new JButton[9];
    private JPanel panel;
    private boolean xPlayerTurn = true;
    private boolean won;

    public TicTacToe(){
        won = false;
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

    public boolean hasWon() {
        return won;
    }

    //https://stackoverflow.com/questions/31216051/what-does-actionevent-e-mean
    public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        if (xPlayerTurn) {
            button.setText("X");
            button.setEnabled(false);
            if (winnerCheck("X")) {
                JOptionPane.showMessageDialog(frame, "You win!!");
                won = true;
                reset();
                return;
            }
            if (tieCheck()) {
                JOptionPane.showMessageDialog(frame, "Tie game!!");
                reset();
                return;
            }
            xPlayerTurn = false;
            computer();
        }
    }

    public void computer(){
        int random = -1;
        for(int i = 0; i < 9; i++){
            if(buttons[i].isEnabled()){
                random = i;
                break;
            }
        }
        if(random != -1){
            buttons[random].setText("O");
            buttons[random]. setEnabled(false);

            if(winnerCheck("O")){
                JOptionPane.showMessageDialog(frame, "Computer Wins!!");
                reset();
            } else if(tieCheck()){
                JOptionPane.showMessageDialog(frame, "Tie game!!");
                reset();;
            }
            xPlayerTurn = true;
        } else{
            JOptionPane.showMessageDialog(frame, "No moves left");
            reset();
        }
    }


    public boolean winnerCheck(String user) {
        //rows
        for (int i = 0; i < 9; i += 3) {
            if (buttons[i].getText().equals(buttons[i + 1].getText())
                    && buttons[i].getText().equals(buttons[i + 2].getText())
                    && buttons[i].getText().equals(user)) {
                return true;
            }
        }

        //columns
        for (int i = 0; i < 3; i++) {
            if (buttons[i].getText().equals(buttons[i + 3].getText())
                    && buttons[i].getText().equals(buttons[i + 6].getText())
                    && buttons[i].getText().equals(user)) {
                return true;
            }
        }

        //diagonals
        if (buttons[0].getText().equals(buttons[4].getText())
                && buttons[0].getText().equals(buttons[8].getText())
                && buttons[0].getText().equals(user)) {
            return true;
        }
        if (buttons[2].getText().equals(buttons[4].getText())
                && buttons[2].getText().equals(buttons[6].getText())
                && buttons[2].getText().equals(user)) {
            return true;
        }
        return false;
    }

    public boolean tieCheck(){
        for(int i = 0; i < 9; i++){
            if(buttons[i].isEnabled()){
                return false;
            }
        }
        return true;
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
