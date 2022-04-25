package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number : ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum of " + firstNumber + " and " + secondNumber + " are : " + sum);
    }
}
