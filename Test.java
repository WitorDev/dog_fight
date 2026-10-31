package dog_fight;
import java.util.ArrayList;

public class Test {
  public void listDogs() {
    // Instanciate dogs
    Dog dog1 = new Dog("Awwy", Breed.ROTTWEILER);
    Dog dog2 = new Dog("Buddy", Breed.GOLDEN_RETRIEVER);
    Dog dog3 = new Dog("Max", Breed.BEAGLE);
    Dog dog4 = new Dog("Bella", Breed.LABRADOR);
    // List all dogs in a ArrayList
    ArrayList<Dog> dogsList = new ArrayList<>();
    // Add all dogs
    dogsList.add(dog1);
    dogsList.add(dog2);
    dogsList.add(dog3);
    dogsList.add(dog4);

    // Go through all dogs in the list
    for (int i = 0; i < dogsList.size(); i++) {
      // Print the dog's name and breed
      Dog currentDog = dogsList.get(i);
      System.out.println("------------------------------");
      System.out.println("Dog number: " + i);
      System.out.println("Dog's name: " + currentDog.name);
      System.out.println("Dog's breed: " + currentDog.breed);
    }
  }
}