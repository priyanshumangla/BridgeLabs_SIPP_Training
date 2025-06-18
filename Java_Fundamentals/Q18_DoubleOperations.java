import java.util.Scanner;

public class Q18_DoubleOperations{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        
        System.out.println("The results of Double Operations are:");
        System.out.println(result1);
        System.out.println( result2);
        System.out.println(result3);
        System.out.println(result4);

        
        input.close();
    }
}
