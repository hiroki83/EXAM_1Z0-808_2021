package bonus3;
public class Dino {
  static final String species;
  static { species = "Raptor";}
  final String type;
  double weight;
  //{ type = "test";}
  public Dino(double weight) {
    this.weight = weight;
    type = "test";
  }
  public static void main(String[] args) {
    Dino dino = new Dino(500);
    System.out.println(dino.weight);
  }
}
