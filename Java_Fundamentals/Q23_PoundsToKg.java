import java.util.Scanner;

public class Q23_PoundsToKg{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        
        double kilograms = pounds * 0.4536;

        
        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);

        input.close();
    }
}
