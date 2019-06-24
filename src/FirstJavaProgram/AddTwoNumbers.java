package FirstJavaProgram;

import java.util.Scanner;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number?");
        int fNumber = scan.nextInt();
        System.out.println("Please enter the second number?");
        int sNumber = scan.nextInt();
        scan.close();
        int sum = fNumber + sNumber;
        System.out.println("The sum of these two numbers = " + sum);
    }
}
