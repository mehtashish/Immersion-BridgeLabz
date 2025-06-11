import java.util.Scanner;

public class studentFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fee = sc.nextInt();
        int discountPercent = sc.nextInt();

        double discountAmount = fee * ((double)discountPercent/100);
        double discountedFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + discountedFee);
    }
}
