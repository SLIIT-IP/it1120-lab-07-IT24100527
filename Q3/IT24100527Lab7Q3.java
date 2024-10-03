import java.util.Scanner;

public class IT24100527Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DISCOUNT_RATE = 0.05;  // 5% discount
        double totalBill, discount = 0, finalAmount;
        char paymentMode;

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            paymentMode = input.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = totalBill * DISCOUNT_RATE;
                finalAmount = totalBill - discount;
                System.out.printf("Discount applied: %.2f\n", discount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                discount = 0;  
                finalAmount = totalBill;
                System.out.println("No discount applied.");
            } else {
                System.out.println("Payment Mode is Not Valid");
                customer--;  
                continue;    
            }

            System.out.printf("Final amount to be paid: %.2f\n", finalAmount);
            System.out.println();  // Blank line between customers
        }

        input.close();
    }
}
