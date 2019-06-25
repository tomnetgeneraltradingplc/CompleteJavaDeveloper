package VariablesInJava;

import java.util.Scanner;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class FindASCII_ValueOfCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any character?");
        char c = scan.next().charAt(0);
        int asciiValue = (int)c;
        System.out.println("The ASCII value of '" + c + "' is = " + asciiValue );
        scan.close();
    }
}
