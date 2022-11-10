import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberDigit {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);

    public int getNumberDigit() {
        int result = 0;
        try {
            System.out.println("Enter first number");
            String[] number1 = String.valueOf(scanner.nextInt()).split("");
            System.out.println("Enter second number");
            String[] number2 = String.valueOf(scanner.nextInt()).split("");
            System.out.println("Enter digit");
            int digit = scanner1.nextInt();

            if (digit < number1.length || digit < number2.length) {
                result = Integer.parseInt(number1[digit - 1]) + Integer.parseInt(number2[digit - 1]);
            } else {
                System.out.println("Your digit is more bigger than number length");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Unfortunately, your value is not a number.");
        }
        return result;
    }
}
