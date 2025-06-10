import java.util.Scanner;

public class distanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kmScale = sc.nextFloat();
        
        double milesScale = kmScale * 0.621371;
        System.out.println(milesScale);
    }
}
