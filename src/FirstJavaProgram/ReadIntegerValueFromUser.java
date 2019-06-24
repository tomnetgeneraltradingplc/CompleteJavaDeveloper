package FirstJavaProgram;

import java.util.Scanner;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class ReadIntegerValueFromUser {
    public static void main(String[] args) {
        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer number?");
        // This method reads the number provided using keyboard
        int inputNumber = scan.nextInt();
        // Closing Scanner after the use
        scan.close();
        // Displaying the number
        System.out.println("Your number is: " + inputNumber);
    }
}
