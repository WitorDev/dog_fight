package dog_fight;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Instantiate new Game Controller
    GameController Controller = new GameController();

    // Instantiate Dogs
    Dog dog1 = new Dog("Buddy", Breed.LABRADOR);
    Dog dog2 = new Dog("Max", Breed.ROTTWEILER);
    Dog dog3 = new Dog("Bella", Breed.GOLDEN_RETRIEVER);
    Dog dog4 = new Dog("Charlie", Breed.BEAGLE);
    // Add dogs to ArrayList
    ArrayList<Dog> dogsList = new ArrayList<>();
    dogsList.add(dog1);
    dogsList.add(dog2);
    dogsList.add(dog3);
    dogsList.add(dog4);

    // Setup Controller
    Controller.setup(dogsList);
  }
}