import java.util.Scanner;
public class Q25_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit");
        sc.close();
    }
}