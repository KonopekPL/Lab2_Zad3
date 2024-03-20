// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Random;

public class Main {
      public static void main(String[] args)
  {
    Random random = new Random();

    System.out.println("Wylosowane liczby");
    for (int i = 0; i < 5; i++) {
      int losowaLiczba = random.nextInt(100);
      System.out.println(losowaLiczba);
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}