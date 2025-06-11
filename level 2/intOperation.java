import java.util.Scanner;

public class intOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int intOperation1 = a + b * c;
        int intOperation2 = a * b + c;
        int intOperation3 = c + a / b;
        int intOperation4 = a % b + c;
        System.out.println("The results of int operations are " + intOperation1 + ", " + intOperation2 + ", " +
                            intOperation3 + " and " + intOperation4);

        sc.close();
    }
}
