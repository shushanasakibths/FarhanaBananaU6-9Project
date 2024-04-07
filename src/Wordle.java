// SHUSHANA SAKI
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Wordle extends JFrame  {

    public static final String[] SECRET_WORDS = {
            "APPLE", "BRAIN", "CHAIR", "DOZEN", "EAGLE", "FAULT", "GRAND", "HOUSE", "IGLOO", "JOKER",
            "KNEEL", "LEMON", "MANGO", "NIGHT", "OASIS", "PUPPY", "QUICK", "ROBOT", "STORM", "TIGER",
            "UMBRA", "VIXEN", "WATER", "XENON", "YIELD", "ZEBRA", "ALIGN", "BEACH", "CANDY", "DRIVE",
            "ELBOW", "FLYER", "GHOST", "HUMOR", "INFER", "JEWEL", "KNIFE", "LIGHT", "MUSIC", "NOVEL",
            "OCEAN", "PANDA", "QUICK", "ROUND", "SLEEP", "TABLE", "UNCLE", "VIRUS", "WOMAN", "YOUTH"
    };

    private String secretWord;
    private int maxAttempts;
    private int remainingAttempts;
    private JLabel feedbackLabel;
    private JTextField guessField;

    public Wordle(String secretWord, int maxAttempts) {
        this.secretWord = secretWord.toUpperCase();
        this.maxAttempts = maxAttempts;
        this.remainingAttempts = maxAttempts;

        setTitle("Wordle");
        setSize(500, 300); // Increased size of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel feedbackPanel = new JPanel();
        feedbackLabel = new JLabel();
        feedbackPanel.add(feedbackLabel);
        mainPanel.add(feedbackPanel, BorderLayout.NORTH);

        JPanel guessPanel = new JPanel();
        JLabel guessLabel = new JLabel("Enter your guess:");
        guessField = new JTextField(15); // Increased size of the JTextField
        guessPanel.add(guessLabel);
        guessPanel.add(guessField);
        mainPanel.add(guessPanel, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        mainPanel.add(submitButton, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    private void checkGuess() {
        String guess = guessField.getText().toUpperCase();
        if (guess.length() != 5) {
            JOptionPane.showMessageDialog(this, "Please enter a 5-letter word.", "Invalid Guess", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder feedback = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            char guessChar = guess.charAt(i);
            char secretChar = secretWord.charAt(i);
            if (guessChar == secretChar) {
                feedback.append(secretChar);
            } else if (secretWord.contains(String.valueOf(guessChar))) {
                feedback.append("+");
            } else {
                feedback.append("-");
            }
        }

        feedbackLabel.setText(feedback.toString());

        if (feedback.toString().equals(secretWord)) {
            JOptionPane.showMessageDialog(this, "Congratulations! You guessed the word: " + secretWord, "Winner", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        remainingAttempts--;
        if (remainingAttempts == 0) {
            JOptionPane.showMessageDialog(this, "Sorry, you ran out of attempts.\nThe secret word was: " + secretWord, "Game Over", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        String secretWord = SECRET_WORDS[random.nextInt(SECRET_WORDS.length)];
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Wordle wordle = new Wordle(secretWord, 6); // Change the max attempts as needed
                wordle.setVisible(true);
            }
        });
    }
}