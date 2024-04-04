//SHUSHANA SAKI
import javax.swing.*;
import java.util.Random;

public class BillionaireRomance extends Storyline {

    public BillionaireRomance(YourName player) {
        super(player);;
    }

    @Override
    public void description() {
        System.out.println( "Inspired by King of Wrath by Ana Huang:\n\nRuthless. Meticulous. Arrogant. Chad Archibald thrives on control, both personally and professionally.The billionaire CEO never planned to marry—until the threat of blackmail forces him into an engagement with a person  he barely knows: " + super.getPlayer().getFirstName() + ", jewelry inheritor and offspring of his newest enemy.\nIt doesn’t matter how beautiful or charming you are. He'll do everything in his power to destroy the evidence and their betrothal.\nThere’s only one problem: now that he has you…he can't bring himself to let you go.\n\nElegant. Ambitious. Well-mannered. You are the perfect child and your family’s ticket into the highest echelons of high society. Marrying a blue-blooded Archibald means opening doors that would otherwise remain closed to your new-money family.\nWhile the rude, elusive Reginald isn't your idea of a dream partner, you agree to their arranged marriage out of duty.\n\nCan you successfully escape the grasp of your hard-hearted captor with your heart unscathed?");
    }

}
