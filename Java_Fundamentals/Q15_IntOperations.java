import java.util.Scanner;

public class Q15_IntOperations{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        
        int result1 = a + b * c;       
        int result2 = a * b + c;       
        int result3 = c + a / b;       
        int result4 = a % b + c;       

        
        System.out.println("The results of Int Operations are:");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        
        sc.close();
    }
}
