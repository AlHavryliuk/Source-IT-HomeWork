import java.util.Scanner;

public class StringSplitter {

    Scanner scanner = new Scanner(System.in);
    String [] array;

    public StringBuffer getString() {
        System.out.println("Enter your string");
        String str = scanner.nextLine();
        array = str.replace(" ","").split("");
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            result = (array.length - i == 1) ? result.append(array[i]) : result.append(array[i]).append(" ");
        }
        return result;
    }
}
