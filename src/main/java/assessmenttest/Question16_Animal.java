package assessmenttest;
public interface Question16_Animal {
  //public default String getName() {
  //  return null;
  //}
  String getName();
}
interface Mammal {
  //public default String getName() {
  //  return null;
  //}
  String getName();
}
abstract class Otter implements Mammal, Question16_Animal {
  //public abstract String getName();
}
