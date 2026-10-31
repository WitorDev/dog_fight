package dog_fight;
public class Dog {
  // Instance variables
  // Stats
  int health = 100;
  boolean is_attacking = false;

  // Info
  String name;
  Breed breed;

  // Constructor
  public Dog(String name, Breed breed) {
    this.name = name;
    this.breed = breed;
  }

  // Methods
  public void switchMode() {
    String message;
    if (Math.random() < 0.5) {
      is_attacking = !is_attacking;
    }
    if (is_attacking) {
      message = name + " switched to attack stance.";
    } else {
      message = name + " switched to defensive stance.";
    }
    System.out.println(message);
  }

  public void damage(double attack_value) {
    double damage_value;
    String message;
    if(health > 0) {
      if (is_attacking) { // In attack stance
        damage_value = attack_value;
      } else { // In defence stance
        damage_value = Math.max(0, attack_value - breed.getDefence());
      }
      health -= damage_value;
      if(health <= 0) {
        health = 0;
      }
      message = name + " was attacked and now has " + health + " points of health.";
    } else { // Died
      message = name + " died.";
    }

    System.out.println(message);
  }

  public void target(Dog enemy) {
    String message;
    if (is_attacking) {
      message = name + " attacked " + enemy.name + ".";
    } else {
      message = name + " defended and did not attack this round.";
    }
    System.out.println(message);
    if(is_attacking) {
      enemy.damage(breed.getAttack());
    }
  }
}
