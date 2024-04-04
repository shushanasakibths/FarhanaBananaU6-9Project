//SHUSHANA SAKI

import java.awt.*;
import java.sql.SQLOutput;

public class BillionaireRomance extends Storyline {

    public BillionaireRomance(YourName player) {
        super(player);;
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
        System.out.println("You raise your head, staring him dead in the eye. Your parents have arranged a marriage for you with the man who killed your sister.");
        System.out.println(Colors.RED + " CHOICE: " + Colors.RESET + "\n1) Greet him with a strained smile\n2) Insult him.");
    }

}
