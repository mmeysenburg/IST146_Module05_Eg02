import java.io.*;
import java.util.*;

/**
 * Class with a method to find min, max, mean temps, and number
 * of days with high temps below zero, for Crete, NE, since 1966.
 *
 * This code reads data once, into two lists, and then uses streams
 * to process the data.
 */
public class TempStream3 {
  /**
   * Process the data and print the results.
   */
  public static void processTemps() {
    // read the data into two lists, one for high temps and one
    // for low temps
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

    // streams for finding min and max from lists are easy
    int min = lows.stream().min(Integer::compareTo).get();
    int max = highs.stream().max(Integer::compareTo).get();

    // stream for finding mean is also pretty easy -- add all
    // values, divide by number of values
    double mean = highs.stream().
      mapToInt(Integer::intValue).sum() / (double)highs.size();

    // to count number of negative highs, we need a predicate class that
    // returns true if a number is negative
    NegativePredicate<Integer> np = new NegativePredicate<>();
    // then we filter the stream with the predicate, and count the 
    // number left over
    long nNeg = lows.stream().filter(np).count();

    System.out.printf("\tMinimum temp: %d (%d days below zero)\n", min, nNeg);
    System.out.printf("\tMaximum temp: %d\n", max);
    System.out.printf("\tMean high temp: %.2f\n", mean);
  }
}
