import java.util.Scanner;

public class Q8_FeeDiscountInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();

        
        System.out.print("Enter the university discount percent: ");
        double discountPercent = input.nextDouble();

        
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
        
        input.close();
    }
}
