package chapter5;
public abstract class Animal {
  protected int age;
  //protected abstract int length;
  public void eat() {
    System.out.println("Animal is eating");
  }
  public abstract String getName();
}
