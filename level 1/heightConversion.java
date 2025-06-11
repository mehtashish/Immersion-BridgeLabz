import java.util.Scanner;

public class heightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cmScale = sc.nextInt();

        double inches = cmScale / 2.54;
        double foot = inches / 12;
        System.out.println("Your Height in cm is " + cmScale + " while in feet is " + foot + " and in inches is " + inches);
    }
}