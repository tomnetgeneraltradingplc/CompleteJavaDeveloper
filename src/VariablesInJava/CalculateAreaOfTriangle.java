package VariablesInJava;

import java.util.Scanner;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class CalculateAreaOfTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Triangle base");
        double base = scan.nextDouble();
        System.out.println("Please enter Triangle hight");
        double hight = scan.nextDouble();
        double area = (base*hight)/2;
        scan.close();

    }
}
