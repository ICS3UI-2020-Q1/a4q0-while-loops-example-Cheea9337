import java.util.Scanner;
/**
 * while loop example
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // declare the variable
    int upTo;
    do{
      System.out.println("What number would you like to count up to? (Positive Number)");
      upTo = input.nextInt();
    } while(upTo <= 0);







    // create a variable to keep track of the number
    int count = 1;
    // using a loop to count up to five
    while(count <= upTo){
      // print the number we are at
      System.out.println(count);
      // increase the value of count by one
      count = count + 1;


    }
    System.out.println("All Done");

    // do while loop
    int count2 = 1;
    // do while loop to count
    do{
        // print the number
        System.out.println(count2);
        // increment the counter
        count2 = count2 + 1;
    }while(count2 <= upTo);
    System.out.println("All Done Again");

  }
}
