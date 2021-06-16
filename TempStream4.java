import java.io.*;
import java.util.*;

/**
 * Class with a method to find min, max, mean temps, and number
 * of days with high temps below zero, for Crete, NE, since 1966.
 *
 * This code reads data once, into two lists, and then uses streams
 * to process the data, using a Lambda expression instead of a separate
 * predicate class. 
 */
public class TempStream4 {
  /**
   * Process the data and print the results.
   */
  public static void processTemps() {
    List<Integer> lows = new ArrayList<>();
    List<Integer> highs = new ArrayList<>();

    try (Scanner file = new Scanner(new FileInputStream("crete.txt"))) {
      while (file.hasNextInt()) {
        highs.add(file.nextInt());
        lows.add(file.nextInt());
      }
    } catch (FileNotFoundException fnfe) {
      System.err.println("Can't open input file.");
    }

    int min = lows.stream().min(Integer::compareTo).get();
    int max = highs.stream().max(Integer::compareTo).get();
    double mean = highs.stream().
      mapToInt(Integer::intValue).sum() / (double)highs.size();

    // only difference: here we use a Java Lambda expression instead of 
    // having to write a predicate class.
    long nNeg = lows.stream().filter(t -> t < 0).count();

    System.out.printf("\tMinimum temp: %d (%d days below zero)\n", min, nNeg);
    System.out.printf("\tMaximum temp: %d\n", max);
    System.out.printf("\tMean high temp: %.2f\n", mean);
  }
}
