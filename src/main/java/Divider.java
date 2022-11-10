import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {

    Scanner scanner = new Scanner(System.in);

    public int getMaxDivider() {
        try {
            System.out.println("Enter first number");
            int number1 = scanner.nextInt();
            System.out.println("Enter second number");
            int number2 = scanner.nextInt();
            int minNumber = Math.min(number1, number2);
            for (int i = minNumber; i > 0; i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    return i;
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Unfortunately, your value is not a number.");
            return -1;
        }
        return -1;
    }
}
