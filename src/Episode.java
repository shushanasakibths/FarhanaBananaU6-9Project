import java.util.ArrayList;
import java.util.Scanner;

public class Episode extends YourName{
    private Scanner scanner;
    private YourName player;
    private ArrayList<Storyline> stories;

    public Episode(YourName player) {
        this.player = player;
        this.scanner = new Scanner(System.in);
        this.stories = new ArrayList<>();

        stories.add(new BillionaireRomance(player));
        stories.add(new MurderMystery(player));
    }

    public void introduction() {
        System.out.println("Welcome to 'Choose Your Own Adventure' Episode!");
        System.out.println("In this episode, you'll have the opportunity to experience two thrilling stories:");
        System.out.println(Colors.PURPLE + "1) Billionaire Romance" + Colors.RESET);
        stories.get(0).description();
        System.out.println();
        System.out.println(Colors.RED + "2) Murder Story" + Colors.RESET);
        stories.get(1).description();
        System.out.println("Please choose a story to begin by entering the corresponding number:");

        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= stories.size()) {
            playStory(choice - 1);
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    private void playStory(int index) {
        Storyline selectedStory = stories.get(index);
        System.out.println("You've chosen to play the " + selectedStory.title() + " story!");
        System.out.println("-------------------------------------------------");
        selectedStory.start();
    }

    public static void main(String[] args) {
        YourName player = new YourName();
        Episode episode = new Episode(player);
        episode.introduction();
    }
}