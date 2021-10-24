package bonus3;
abstract class Mammal {
  public abstract int getAge();
}
abstract class Animal {
  //public int getAge();//DOES NOT COMPILE
}
abstract interface Herviore {
}
//public class HoneyBadger extends Mammal, Animal implements Herviore {//DOES NOT COMPILE
public class HoneyBadger extends Mammal implements Herviore {
  //int getAge() {//DOES NOT COMPILE
  public int getAge() {
    return 5;
  }
}
