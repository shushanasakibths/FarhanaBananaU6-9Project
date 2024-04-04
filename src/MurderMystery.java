import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class MurderMystery extends Storyline{
    public MurderMystery(YourName player){
        super(player);
    }

    @Override
    public void title(){
        System.out.println("Lights Out: An Original Farhana Banana Story");
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
        System.out.println("'Welcome " + super.getPlayer() +", Ashslay says teary eyed, \n" +
                "her petite frame wracked with sobs, 'thanks for coming \n" +
                "to this sleepover. I thought it would be a great way for us \n" +
                "to grieve over your brother and my husband. Since he left me \n" +
                "this huge mansion, it feels wayyy too empty and so I also invited \n" +
                "Elislaybeth and Jesslayca.'");

        System.out.println(super.getPlayer() + "It's no problem, Ashslay");
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHOICE: What do you want to say to Ashslay next?\n" + "1) Let's just go inside and prepare...  OR  2) Yeah I bet it's hard, having such a huggeee mansion all to yourself");
        int choice1 = scanner.nextInt();
        if(choice1 == 1){
            System.out.println("Ashslay: Alright, let's go!");
        } else if(choice1 == 2){
            System.out.println("Ashslay: How could you say that to me? You know how much your brother meant to me...");
            System.out.println(super.getPlayer() + ": Yeah my bad. Let's just go in.");
        } else{
            System.out.println("invalid choice!!!");
        }

        System.out.println(super.getPlayer() + ": 'Hey girls!'");
        System.out.println("Elislaybeth and Jesslayca: 'Hey " + super.getPlayer() + "!', they say in unison, their crimson orbs reaching into your soul, as if they can see your deepest darkest secrets....");
        System.out.println("Narrator: Despite the gloomy occasion, the four of you have a great time, playing multiple games.");
        System.out.println(super.getPlayer() + ": Oh wow, time has flown by! i think we should head for bed for now.");
        System.out.println("Ashslay: What, no!! Let's just play one more game, hide and seek!");
        System.out.println("CHOICE: 1) Really? Hide and Seek? What are you, a kid?  OR  2)Ok, let's play.");
        int choice2 = scanner.nextInt();
        if(choice2 == 1){
            System.out.println("Ashslay: 'Aww don't be like that, I just wanted to play something that brings good memories...");
            System.out.println("Elislaybeth and Jesslayca: 'Yeah, hide and seek is fun!!', they screech in union, as they float into the air.");
            System.out.println(super.getPlayer() + ": Alright, who's going to be the seeker?");
        }

    }

}