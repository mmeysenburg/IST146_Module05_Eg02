/**
 * Main class for IST 146 Module 5 Example 2.
 *
 * This exampale illustrates using Java streams to process
 * file data.
 */
class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by this app.
   */
  public static void main(String[] args) {
    System.out.println("Results from TempStream1:");
    TempStream1.processTemps();

    System.out.println("Results from TempStream2:");
    TempStream2.processTemps();

    System.out.println("Results from TempStream3:");
    TempStream3.processTemps();

    System.out.println("Results from TempStream4:");
    TempStream4.processTemps();
  }
}