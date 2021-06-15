import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * Class with a method to find min and max temps for Crete, NE, since 1966.
 *
 * This code uses simple Java streams.
 */
public class TempStream2 {
  /**
   * Process the data and print the results.
   */
  public static void processTemps() {
    try {
      // create a stream of strings from the input file
      Stream<String> stream = Files.lines(Paths.get("simpler-crete.txt"));
      // map to integers, find minimum, and get result
      int min = stream.mapToInt(s -> Integer.parseInt(s)).min().getAsInt();

      // repeat the above, but find maximum value; note we're reading
      // the file twice, once for the min, once for the max
      stream = Files.lines(Paths.get("simpler-crete.txt"));
      int max = stream.mapToInt(s -> Integer.parseInt(s)).max().getAsInt();

      System.out.printf("\tMinimum temp: %d\n", min);
      System.out.printf("\tMaximum temp: %d\n", max);
    } catch (IOException ioe) {
      System.err.println("Can't read input file.");
    }
  }
}