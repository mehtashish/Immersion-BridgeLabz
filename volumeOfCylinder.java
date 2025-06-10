import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();

        double volume = Math.PI * radius * radius * height;
        System.out.println(volume);
    }
}
