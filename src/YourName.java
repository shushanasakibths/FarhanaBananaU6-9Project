// SHUSHANA SAKI

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YourName {
    private String firstName;
    private String lastName;
    private CharacterTraits character;
    private List<String> inventory;
    private int diamondsCollected;
    private Scanner scanner;

    public YourName() {
        this.inventory = new ArrayList<>();
        this.diamondsCollected = 0;
        customizeCharacter();
        scanner = new Scanner(System.in);
    }

    private void customizeCharacter() {


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

        character = new CharacterTraits(eyeColor, hairColor, isCurly, skinColor);
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

    public CharacterTraits getCharacter() {
        return character;
    }

    public int getDiamondsCollected() {
        return diamondsCollected;
    }
    public void addItem(String item) {
        inventory.add(item);
    }

    public void removeItem(String item) {
        inventory.remove(item);
    }


    public void earnDiamonds(int amount) {
        diamondsCollected += amount;
    }

    public void spendDiamonds(int amount) {
        if (diamondsCollected >= amount) {
            diamondsCollected -= amount;
        } else {
            System.out.println("Not enough diamonds!");
        }
    }
}