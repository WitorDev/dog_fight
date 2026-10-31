package dog_fight;
public enum Breed {
  ROTTWEILER(10, 5),
  GOLDEN_RETRIEVER(5, 10),
  LABRADOR(7.5, 7.5),
  BEAGLE(2, 13);

  private final double attack;
  private final double defence;

  // Define attack and defence values
  private Breed(double attack, double defence) {
    this.attack = attack;
    this.defence = defence;
  }

  public double getAttack() {
    return attack;
  }

  public double getDefence() {
    return defence;
  }
}