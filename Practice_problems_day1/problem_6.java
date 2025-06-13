/*Calculate Simple Interest
Write a program to calculate simple interest using the formula :Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user.*/

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the Rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        
        double simpleInterest = (principal * rate * time) / 100;

        
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
