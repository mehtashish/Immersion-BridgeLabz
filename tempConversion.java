import java.util.Scanner;

public class tempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsiusScale = sc.nextInt();
        
        int fahrenheitScale = (celsiusScale * 9/5) + 32;
        System.out.println(fahrenheitScale);
    }
}