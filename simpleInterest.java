import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float rate = sc.nextFloat();
        float time = sc.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;
        System.out.println(simpleInterest);
    }
}