import java.util.Scanner;

public class SimpleNumber {

    Scanner scanner = new Scanner(System.in);

    public void searchSimpleNumber() {
        System.out.println("I will search all simple number to this value: ");
        int n = scanner.nextInt();
        System.out.println("Result: " );
        nextPrime:
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) continue nextPrime;
            }
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
