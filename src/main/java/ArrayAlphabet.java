import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ArrayAlphabet {

    String[] arr_EN = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    Scanner scanner = new Scanner(System.in);


    public int getIndex() {
        System.out.println("Enter letter");
        String letter = scanner.nextLine().toUpperCase();
        for (int i = 0; i < arr_EN.length; i++) {
            if (letter.equals(arr_EN[i])) {
                return ++i;
            }
        }
        return -1;
    }

    public String getLetter() {
        try {
            System.out.println("Enter number");
            int number = scanner.nextInt();
            return number < arr_EN.length ? arr_EN[--number] : null;
        } catch (InputMismatchException ex) {
            System.out.println("It`s not a number");
        }
        return null;
    }

    public String getNextLetterByIndex() {
        try {
            System.out.println("Enter your number");
            Scanner newScanner = new Scanner(System.in);
            int nextIndex = newScanner.nextInt();
            return arr_EN[nextIndex];
        } catch (InputMismatchException ex) {
            System.out.println("Is not a number");
        }
        return null;
    }

    public String getNextLetterByLetter () {
        System.out.println("Enter your letter");
        Scanner newScanner = new Scanner(System.in);
        String letter = newScanner.nextLine().toUpperCase(Locale.ROOT);
        for (int i = 0; i < arr_EN.length; i++) {
            if (letter.equals(arr_EN[i])) {
                return arr_EN[++i];
            }
        }
        return "Letter '" + letter + "' is not found";
    }
}
