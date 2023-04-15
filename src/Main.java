import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean rightChar = false;
        while (!rightChar) {
            try {
                System.out.println("If you want to convert from Fahrenheit to Celsius press 0");
                System.out.println("If you want to convert from Celsius to Fahrenheit press 1");
                System.out.println("Or press 2 to close");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                switch (num) {
                    case 0:
                        System.out.println("Please insert the temperature in Celsius:");
                        float cTemp = sc.nextFloat();
                        float convToFtemp = (cTemp * 9 / 5) + 32;
                        System.out.println("The temperature in Fahrenheit is: " + convToFtemp + " F");
                        break;
                    case 1:
                        System.out.println("Please insert the temperature in Fahrenheit:");
                        float fTemp = sc.nextFloat();
                        float convToCtemp = ((fTemp - 32) * 5) / 9;
                        System.out.println("The temperature in Celsius is: " + convToCtemp + " C");
                        break;
                    case 2:
                        break;
                }
                rightChar = true;
            } catch (InputMismatchException e) {
                System.out.println("You have put a mismatched character");
            }
        }
    }
}
