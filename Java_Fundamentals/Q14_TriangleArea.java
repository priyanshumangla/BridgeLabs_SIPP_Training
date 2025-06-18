import java.util.Scanner;

public class Q14_TriangleArea{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter base of triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        
        double areaCm2 = 0.5 * base * height;

        // Convert square centimeters to square inches
        // 1 inch = 2.54 cm => 1 sq inch = (2.54)^2 = 6.4516 cm²
        double areaIn2 = areaCm2 / 6.4516;

        
        System.out.println("The Area of the triangle in sq in is " + areaIn2 +
                " and sq cm is " + areaCm2);

        
        input.close();
    }
}
