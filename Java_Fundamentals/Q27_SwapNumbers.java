import java.util.Scanner;
public class Q27_SwapNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are " + a + " and " + b);
        sc.close();
    }
}