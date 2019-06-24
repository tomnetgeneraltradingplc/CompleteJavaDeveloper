package FirstJavaProgram;

import java.util.Scanner;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class CheckIfNumberIsPositiveorNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your number?");
        int inputNumber = scan.nextInt();
        scan.close();
        if (inputNumber>0){
            System.out.println("Your number is positive");

        }
        else if (inputNumber<0){
            System.out.println("Your number is Negative");

        }
        else {
            System.out.println("Your number is 0, neither negative nor positive");
        }
    }
}
