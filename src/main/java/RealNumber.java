import java.util.InputMismatchException;
import java.util.Scanner;

public class RealNumber {
    Scanner scanner = new Scanner(System.in);

    public double sum() {
        try {
            System.out.println("Enter first number");
            double number1 = scanner.nextInt();
            System.out.println("Enter second number");
            double number2 = scanner.nextInt();
            return number1 + number2;
        } catch (InputMismatchException ex) {
            System.out.println("Unfortunately, your value is not a number.");
            return 0;
        }

    }
}
