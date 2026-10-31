package dog_fight;
import java.util.ArrayList;
import java.util.Scanner;

public class GameController {
  // Initialize Scanner
  Scanner sc = new Scanner(System.in);
  boolean running = true;

  public void setup(ArrayList<Dog> dogsList) {
    // Organize
    System.out.println("------------------------------");

    // Show dogs
    System.out.println(dogsList.size() + " dogs will fight:");
    for (int i = 0; i < dogsList.size(); i++) {
      System.out.println(dogsList.get(i).name);
    }
    System.out.println(">Press enter to start fight:");
    sc.nextLine();
    fight(dogsList);
  }
  public void fight(ArrayList<Dog> dogsList) {
    do {
      // Organize
      System.out.println("------------------------------");

      // Set stances for each dog
      System.out.println(">Stances have been set:");
      for (int i = 0; i < dogsList.size(); i++) {
        dogsList.get(i).switchMode();
      }

      // Organize
      System.out.println("------------------------------");
      System.out.println(">Started Fight:");
      // Set target for each dog
      for (int i = 0; i < dogsList.size(); i++) {
        int targetIndex;
        do {
          targetIndex = (int) (Math.random() * dogsList.size());
        } while (targetIndex == i);
        dogsList.get(i).target(dogsList.get(targetIndex));
      }
      checkForEnd(dogsList);
    } while(running);
  }

  public void checkForEnd(ArrayList<Dog> dogsList) {
    // Check if more than one dog is alive
    int amount_dead = 0;
    for (Dog dog : dogsList) {
      if(dog.health <= 0) {
        amount_dead++;
      }
    }
    if(amount_dead >= dogsList.size() - 1) {
      System.out.println("------------------------------");
      for (Dog dog : dogsList) {
        if(dog.health > 0) {
          System.out.println("The winner of the fight is: " + dog.name);
        }
      }
      System.out.println("End.");
      running = false;
    }
  }
}