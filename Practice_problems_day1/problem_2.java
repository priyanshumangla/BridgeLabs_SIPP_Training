/*Write a program that takes two numbers as input from the user and prints their sum.*/

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        
        int sum = num1 + num2;

        
        System.out.println("The sum of the two numbers is: " + sum);

        scanner.close();
    }
}
