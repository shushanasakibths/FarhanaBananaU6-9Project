//SHUSHANA SAKI

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Random;

public class BillionaireRomance extends Storyline {

    public BillionaireRomance(YourName player) {
        super(player);
    }

    @Override
    public void title(){
        System.out.println("King of Wrath: Retold");
    }

    @Override
    public void description() {
        System.out.println( "Inspired by King of Wrath by Ana Huang:\n\nRuthless. Meticulous. Arrogant. Chad Archibald thrives on control, both personally and professionally.The billionaire CEO never planned to marry—until the threat of blackmail forces him into an engagement with a person  he barely knows: " + super.getPlayer().getFirstName() + ", jewelry inheritor and offspring of his newest enemy.\nIt doesn’t matter how beautiful or charming you are. He'll do everything in his power to destroy the evidence and their betrothal.\nThere’s only one problem: now that he has you…he can't bring himself to let you go.\n\nElegant. Ambitious. Well-mannered. You are the perfect child and your family’s ticket into the highest echelons of high society. Marrying a blue-blooded Archibald means opening doors that would otherwise remain closed to your new-money family.\nWhile the rude, elusive Reginald isn't your idea of a dream partner, you agree to their arranged marriage out of duty.\n\nCan you successfully escape the grasp of your hard-hearted captor with your heart unscathed?");
    }

    @Override
    public void beginning() {
        System.out.println("Blood rushes to your head, betrayal simmering in the pit of your stomach.");
        System.out.println("How could your parents do this to you? You've done everything right. So why?");
        System.out.println("Chad stands before you, tall and imposing. His jaw clenches at the sight of your hateful, " + super.getPlayer().getCharacter().getEyes()[0] + " eyes.");
        System.out.println(Colors.BLUE + "Chad: " + Colors.RESET + super.getPlayer().getFirstName() + "...pleasure to meet you.");
        System.out.println("His voice drips with sarcasm, speaking to you as if you were a child who did wrong.");
        System.out.println("Chad Archibald the Fifteenth, top 5 billionaire under 40 on Forbes, CEO of Vanguard. You've met him before, though far less civil.");
        System.out.println("You raise your head, staring him dead in the eye. Your parents have arranged a marriage for you with the man who killed your sister. You have a year till the wedding...");
        System.out.println(Colors.RED + " CHOICE: " + Colors.RESET + "\n1) Greet him with a strained smile\n2) Insult him.");
        int choice = super.getScanner().nextInt();
        switch (choice) {
            case 1:
                System.out.println("You muster a strained smile, hoping to maintain some semblance of grace. Deep down, you're seething.");
                System.out.println(Colors.BLUE + "Chad: " + Colors.RESET + "I look forward to getting to know you better, " + super.getPlayer().getFirstName() + ".");
                System.out.println("A flush colors your " + super.getPlayer().getCharacter().getSkin()[0] + " skin. You nod, unable to muster any words.");
                break;
            case 2:
                System.out.println("You can't contain your anger any longer.");
                System.out.println(Colors.BLUE + "Chad: " + Colors.RESET + "Aren’t you as charming as ever? If you intend to be this childish throughout our arrangement, then I assure you, it will only make your life miserable.");
                System.out.println("The look of disdain on his face only intensifies your burning resentment.");
                break;
            default:
                System.out.println("Chad laughs at your silence, walking away to dine with your parents.");
                break;
        }
        System.out.println("Despite the tension, the night continues. You try to push your feelings aside, focusing on the bigger picture.");
        System.out.println("This marriage isn't just about you. It's about your family, your future, and the legacy you're destined to leave behind.");
        System.out.println("You are the daughter your parents deserve, after all...");
        System.out.println("Days turn into weeks, and weeks into months. Slowly but surely, you find yourself getting to know Chad better.");
        System.out.println("There's more to him than meets the eye, and you start to wonder if there's a chance to break down the walls he's built around himself.");
        System.out.println("-------------------------------------------------");
        System.out.println("You are at engagement shoot with Chad, to your disappointment. At least you look good.");
        System.out.println("Your " + super.getPlayer().getCharacter().getHair()[3] + ", " + super.getPlayer().getCharacter().getCurly()[2] + " hair is pulled back into a slick bun.");
        System.out.println("Chad is ready and waiting for you. It's time for you to pick an outfit!" );
        System.out.println("The stylist presents you with a gorgeous, stunning, outfit. You love it so much, you fear you might die without it.");
        System.out.println("You want to impress Chad and the outfit perfectly suits your " + super.getPlayer().getCharacter().getEyes()[3] + " eyes!" );
        System.out.println(Colors.RED + " CHOICE: " + Colors.RESET + "\n1) Wear that outfit and stun Chad!" + Colors.BLUE + " 10 DIAMONDS" + Colors.RESET + "\n2) Take the photoshoot in your hoodie that you haven't washed in 5 days");
        choice = super.getScanner().nextInt();


        switch (choice) {
            case 1:
                if (super.getPlayer().getDiamonds() >= 10) {
                    super.getPlayer().spendDiamonds(10);
                    System.out.println("You decide to wear the stunning outfit, feeling confident and elegant.");
                    System.out.println("Chad's eyes widen appreciatively when he sees you.");
                    System.out.println("The way his eyes rake over your form makes your heart flutter.");
                    System.out.println(Colors.BLUE + "Chad: " + Colors.RESET + " You look...befitting..");
                    System.out.println("He clears his throat, turning away. Is that blush on his cheeks?!");
                } else {
                    System.out.println("You do not have enough diamonds to make this choice.");
                    System.out.println("Would you like to play minigames to earn diamonds?");
                    System.out.println(Colors.RED + " CHOICE: " + Colors.RESET + "\n1) Play Wordle\n2) Play TicTacToe\n3) Play Maze\n4) Play Rock Paper Scissors\n5) Be broke then...");

                    choice = super.getScanner().nextInt();

                    if (choice == 5) {
                        System.out.println("You decide to continue without the stunning outfit.");
                        System.out.println("Chad looks slightly disappointed but tries to hide it.");
                    } else {
                        super.playMinigames(choice);
                    }
                }
                break;
            case 2:
                System.out.println("You decide to take the photoshoot in your old hoodie.");
                System.out.println("Chad raises an eyebrow, clearly unimpressed. And what's that horrid smell?");
                break;
            default:
                System.out.println("Invalid choice. Please select either 1 or 2.");
                break;
        }

    }

}
