// SHUSHANA SAKI

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YourName {
    private String firstName;
    private String lastName;
    private CharacterTraits character;
    private List<String> inventory;
    private static int diamondsCollected;
    private Scanner scanner;

    public YourName() {
        this.inventory = new ArrayList<>();
        diamondsCollected = 0;
        scanner = new Scanner(System.in);
    }

    public void customizeCharacter() {

        System.out.println("Enter your first name:");
        this.firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        this.lastName = scanner.nextLine();

        System.out.println("Customize your character:");

        System.out.println("Choose eye color (blue, brown, green):");
        String eyeColor = scanner.nextLine();

        System.out.println("Choose hair color (black, blonde, red):");
        String hairColor = scanner.nextLine();

        System.out.println("Is your hair curly? (true/false):");
        boolean isCurly = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Choose skin color (dark, brown, tan, medium, fair):");
        String skinColor = scanner.nextLine();

        System.out.println("What do you identify as? (girl, boy, nonbinary):");
        String gender = scanner.nextLine();

        character = new CharacterTraits(eyeColor, hairColor, isCurly, skinColor, gender);
    }


    public List<String> getInventory() {
        return inventory;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getDiamonds() {
        return diamondsCollected;
    }
    public CharacterTraits getCharacter() {
        return character;
    }


    public void addItem(String item) {
        inventory.add(item);
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }


    public static void earnDiamonds(int amount) {
        diamondsCollected += amount;
    }

    public static void spendDiamonds(int amount) {
        if (diamondsCollected >= amount) {
            diamondsCollected -= amount;
        } else {
            System.out.println("Not enough diamonds!");
        }
    }

}