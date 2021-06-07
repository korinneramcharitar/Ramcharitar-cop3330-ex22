/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */


package base;
import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("Enter the third number: ");
        num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(" The largest number is " + num1);

        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(" The largest number is " + num2);
        }
        if (num3 > num2 && num1 < num3) {
            System.out.println("The largest number is " + num3);
        }
    }
}