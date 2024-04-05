import java.util.Scanner;

public class Storyline {
    private YourName player;
    private Scanner scanner;
    public Storyline(YourName player) {
        this.player = player;
        scanner = new Scanner(System.in);
    }

    public YourName getPlayer() {
        return player;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void start() {
        beginning();
        middle();
        end();
    }

    public void title(){
        System.out.println("Here is the title of the story!");
    }

    public void description() {
        System.out.println("Here is the description of the story!");
    }


    public void beginning() {
        System.out.println("Here's the beginning");
    }

    public void middle() {
        System.out.println("Here's the middle");
    }

    public void end() {
        System.out.println("Here's the end");
    }
}
