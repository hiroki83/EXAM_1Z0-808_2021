package chapter2;

public class SearchSampleWithContinue {
  public static void main(String[] args) {
    PARENT_LOOP: for(int i = 1; i <= 4; i++) {
      for (char j = 'a'; j <= 'c'; j++) {
        if (i == 2 || j == 'b') {
          continue PARENT_LOOP;
        }
        System.out.println(" "+j+i);
      }
    }
  }
} 
