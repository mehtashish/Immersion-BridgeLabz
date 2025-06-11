import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        
        float addition = number1 + number2;
        float subtraction = Math.abs(number1 - number2);
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers is " + 
                            addition + ", " + subtraction + ", " + multiplication + " and " + division + " respectively");
        
        sc.close();
    }
}