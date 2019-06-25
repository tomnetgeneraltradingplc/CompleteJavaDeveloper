package VariablesInJava;

import java.util.Scanner;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number?");
        double fNumber = scan.nextDouble();
        System.out.println("Please enter the second number?");
        double sNumber = scan.nextDouble();
        double result = fNumber*sNumber;
        System.out.println("The Multiplication result is = " + result);
        scan.close();

    }
}
