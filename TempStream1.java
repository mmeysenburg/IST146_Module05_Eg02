import java.io.*;
import java.util.*;

/**
 * Class with a method to find min, max, mean temps, and number
 * of days with high temps below zero, for Crete, NE, since 1966.
 *
 * This code uses traditional loops and if statements to do its task.
 */
public class TempStream1 {
  /**
   * Process the data and print the results.
   */
  public static void processTemps() {
    try (Scanner file = new Scanner(new FileInputStream("crete.txt"))) {
      double mean = 0.0;
      int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, n = 0;
      int nNeg = 0;

      while (file.hasNextInt()) {

        int hi = file.nextInt();
        int lo = file.nextInt();

        if (hi > max) {
          max = hi;
        }

        if (lo < min) {
          min = lo;
        }

        if (lo < 0) {
          nNeg++;
        }

        mean += hi;

        n++;
      }

      mean /= n;

      System.out.printf("\tMinimum temp: %d (%d days below zero)\n", min, nNeg);
      System.out.printf("\tMaximum temp: %d\n", max);
      System.out.printf("\tMean high temp: %.2f\n", mean);

    } catch (FileNotFoundException fnfe) {
      System.err.println("Can't open input file!");
    }
  }
}
