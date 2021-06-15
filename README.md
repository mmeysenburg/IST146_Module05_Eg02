# IST146_Module05_Eg02

This is the second example for IST 146 Module 5. The code shows how to use streams
to process data, and also illustrates the use of Lambda expressions. 

## Instructions

1. Log on to your replit account. 
2. Click the "+ New repl" button to create a new repl. 
3. Click on the "Import from GitHub" tab. 
4. Type or paste the following URL into the "Paste any repository URL" text field: `github.com/mmeysenburg/IST146_Module05_Eg02`
5. Click on the "Import from github" button.
6. Click the "Done" button in the ".replit" dialog that appears.
7. From the "Console" tab, enter the following command: `rm .replit` *If you omit this step, the "Run" button will not work as it should!*
8. Examine the code.
9. At any time you can run the code from the user's perspective, or, from a developer's point of view, execute the unit tests that have been provided.
  * To run the code, click the "Run" button.
  * To execute the unit tests (if any), enter the following command in the "Console" tab: `bash test.sh`

## Files in the repository

* `Main.java`: Main program to run the code from a user's perspective. This file's `main()` method is invoked when you click the "Run" button.
* `NegativePredicate.java`: Predicate class to determine if a number is negative.
* `TempStream1.java`: Traditional loop / if solution to problem.
* `TempStream2.java`: Stream solution using modified file format.
* `TempStream3.java`: Stream solution using lists vs. files, and predicate class.
* `TempStream4.java`: Stream solution using Lambda expression instead of predicate class.
* `README.md`: This README file.
* `crete.txt`: Data file with high and low temperatures for Crete, NE, for each day since 1966.
* `simpler-crete.txt`: As for crete.txt, but with one temperature per line (high then low).
* `LICENSE`: GNU General Public License v3.0 for these materials.
