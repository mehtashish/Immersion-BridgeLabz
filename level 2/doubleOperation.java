import java.util.Scanner;

public class doubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double doubleOperation1 = a + b * c;
        double doubleOperation2 = a * b + c;
        double doubleOperation3 = c + a / b;
        double doubleOperation4 = a % b + c;
        System.out.println("The results of double operations are " + doubleOperation1 + ", " + doubleOperation2 + ", " +
                            doubleOperation3 + " and " + doubleOperation4);

        sc.close();
    }
}
