import java.util.Scanner;

public class distanceConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInFeet = sc.nextInt();
        int distanceInYard = distanceInFeet / 3;
        int distanceInMile = distanceInYard / 1760;

        System.out.println("The distance in yards is " + distanceInYard + " while the distance in miles is " + distanceInMile);
        sc.close();
    }
}
