import java.util.Scanner;
import java.util.Random;
public class RPSReg {
    public static void main(String[] args) {
        play();
    }

    public static void play(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true){
            System.out.println("Enter your move: rock, paper, or scissors (to exit the game, type 'quit')");
            String player = scanner.nextLine().toLowerCase();

            if(player.equals("quit")){
                System.out.println("Thanks for playing!");
                break;
            }

            if(!player.equals("rock") && !player.equals("paper") && !player.equals("scissors")){
                System.out.println("Invalid move, please enter one of the choices mentioned above.");
                return;
            }

            //the 3 refers to the 3 choices
            int computerIdx = random.nextInt(3);
            String computer = "";
            switch (computerIdx){
                case 0:
                    computer = "rock";
                    break;
                case 1:
                    computer = "paper";
                case 2:
                    computer = "scissors";
                    break;
            }

            System.out.println("Computer chose: " + computer);

            if(player.equals(computer)){
                System.out.println("It's a tie!!");
            } else if ((player.equals("rock") && computer.equals("scissors")) ||
                    (player.equals("paper") && computer.equals("rock")) ||
                    (player.equals("scissors") && computer.equals("paper"))){
                System.out.println("You win!!");
            } else{
                System.out.println("You lose!!");
            }
        }
        scanner.close();
    }
}
