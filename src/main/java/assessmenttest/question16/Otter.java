package assessmenttest.question16;

interface Animal {
  public default String getName() {
    return null;
  }
}
interface Mammal {
  public default String getName() {
    return null;
  }
}
abstract class Otter implements Mammal, Animal {
  public String getName() {
    return null;
  }
}
