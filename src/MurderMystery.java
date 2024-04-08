import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class MurderMystery extends Storyline{
    public MurderMystery(YourName player){
        super(player);
    }

    @Override
    public String title(){
        return "Lights Out: An Original Farhana Banana Story";
    }

    @Override
    public void description(){
        System.out.println("Life is good: You come from a wealthy family, \n" +
                "you love your job as a professional sleeper, \n" +
                "and your best friend and brother recently got married. \n" +
                "However, the sudden death of your brother halts your peaceful life.\n" +
                " Thankfully, your best friend/ex sister-in-law decides to\n" +
                " host a sleepover in their secluded, aesthetic mansion to help \n" +
                "the grieving process. But when the power goes out, only to turn back \n" +
                "on with a dead body, fingers point towards each other. \n" +
                "Who is behind the bloodbath, and are you the next victim?\n");
    }


    @Override
    public void beginning(){
        System.out.println("Ding dong! Your ex sister-in-law who\n" +
                " is also your best friend opens the door.");
        System.out.println("'Welcome " + super.getPlayer().getFirstName() +", Ashslay says teary eyed, \n" +
                "her petite frame wracked with sobs, 'thanks for coming \n" +
                "to this sleepover. I thought it would be a great way for us \n" +
                "to grieve over your brother and my husband. Since he left me \n" +
                "this huge mansion, it feels wayyy too empty and so I also invited \n" +
                "Elislaybeth and Jesslayca.'");

        System.out.println(super.getPlayer().getFirstName() + ": It's no problem, Ashslay");
        System.out.println("CHOICE: What do you want to say to Ashslay next?\n" + "1) Let's just go inside and prepare...  OR  2) Yeah I bet it's hard, having such a huggeee mansion all to yourself");
        int choice = super.getScanner().nextInt();
        switch (choice){
            case 1:
                System.out.println("Ashslay: Alright, let's go!");
                break;
            case 2:
                System.out.println("Ashslay: How could you say that to me? You know how much your brother meant to me...");
                System.out.println(super.getPlayer().getFirstName() + ": Yeah my bad. Let's just go in.");
                break;
            default:
            System.out.println("Ashslay goes silent, an indescribable expression on her face.");
            break;
        }

        System.out.println(super.getPlayer().getFirstName() + ": 'Hey girls!'");
        System.out.println("Elislaybeth and Jesslayca: 'Hey " + super.getPlayer().getFirstName() + "!', they say in unison, their crimson orbs reaching into your soul, as if they can see your deepest darkest secrets....");
        System.out.println("NARRATOR: Despite the gloomy occasion, the four of you have a great time, playing multiple games.");
        System.out.println(super.getPlayer().getFirstName() + ": Oh wow, time has flown by! i think we should head for bed for now.");
        System.out.println("Ashslay: What, no!! Let's just play one more game, hide and seek!");
        System.out.println("CHOICE: 1) Really? Hide and Seek? What are you, a kid?  OR  2)Ok, let's play.");
        choice = super.getScanner().nextInt();
        switch (choice){
            case 1:
                System.out.println("Ashslay: 'Aww don't be like that, I just wanted to play something that brings good memories...");
                System.out.println("Elislaybeth and Jesslayca: 'Yeah, hide and seek is fun!!', they screech in union, as they float into the air.");
                System.out.println(super.getPlayer().getFirstName() + ": Alright, who's going to be the seeker?");
                break;
            case 2:
            System.out.println(super.getPlayer().getFirstName() + ": So who's going to be the seeker?");
            break;
            default:
            System.out.println("invalid!!");
        }

        System.out.println("Ashslay: I'll be the seeker, you guys get 4 mins to hide anywhere within this mansion. Make sure to hide like your life depends on it!!");
        System.out.println("NARRATOR: But before that, you must change into your lucky hide and seek outfit! It goes perfectly with your " + super.getPlayer().getCharacter().getEyes()[2] + " eyes and your " + super.getPlayer().getCharacter().getHair()[0] + " hair!");
        System.out.println(" 1) Wear this outfit" + Colors.BLUE + " 10 DIAMONDS" + Colors.RESET + " Or 2) wear your dress that is all torn up from fighting a deranged caterpillar earlier" );
        choice = super.getScanner().nextInt();

        switch (choice){
            case 1:
                if(super.getPlayer().getDiamonds() >= 10){
                    super.getPlayer().spendDiamonds(10);
                    System.out.println("You decide to wear your special hide and seek outfit, practically already declaring you winner.");
                    System.out.println("Everyone squeals over your extraordinary choice of apparel. ");
                } else{
                    System.out.println("You do not have enough diamonds to wear this outfit!!");
                    System.out.println("Would you like to play some mini games to acquire more?");
                    System.out.println(Colors.RED + " CHOICE: " + Colors.RESET + "\n1) Play Wordle\n2) Play TicTacToe\n3) Play Rock Paper Scissors\n4) Play Maze\n5) Be broke then...");

                    choice = super.getScanner().nextInt();

                    if (choice == 5) {
                        System.out.println("Be broke then...");
                    } else {
                        super.playMinigames(choice);
                    }
                }
                break;
            case 2:
                System.out.println("You decide to wear your caterpillar mangled, torn dress.");
                System.out.println("Ashslay tries to hide her disgust, but Elislaybeth and Jesslayca crank their heads 360 degrees towards you, throwing leeches at you in loathing.");
                break;
            default:
                System.out.println("invalid, select 1 or 2");
                break;
        }




    }
}