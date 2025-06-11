import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();

        double areaInCm = 0.5 * base * height;
        double areaInInch = areaInCm / 2.54;

        System.out.println("The Area of the triangle in sq in is " + areaInInch + " and sq cm is " + areaInCm);
        sc.close();
    }
}
