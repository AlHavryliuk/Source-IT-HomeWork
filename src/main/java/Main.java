public class Main {

    public static void main(String[] args) {

//        Task 1

        System.out.println("Task 1 (Real number)");
        RealNumber realNumber = new RealNumber();
        System.out.println("Result: " + realNumber.sum());

//        Task 2

        System.out.println("Task 2 (String splitter)");
        StringSplitter stringSplitter = new StringSplitter();
        System.out.println("Result: " + stringSplitter.getString());

//        Task 3

        System.out.println("Task 3 (Divider)");
        Divider divider = new Divider();
        System.out.println("Result: " + divider.getMaxDivider());

//        Task 4

        System.out.println("Task 4 (Digit number)");
        NumberDigit numberDigit = new NumberDigit();
        System.out.println("Result: " + numberDigit.getNumberDigit());

//        Task 4

        System.out.println("Task 5 (Simple number)");
        SimpleNumber simpleNumber = new SimpleNumber();
        simpleNumber.searchSimpleNumber();

//        Task 5

        System.out.println("Task 6 (Excel table imitation)");
        ArrayAlphabet arrayAlphabet = new ArrayAlphabet();
        System.out.println("Result: " + arrayAlphabet.getIndex());
        System.out.println("Result: " + arrayAlphabet.getLetter());
        System.out.println("Result: " + arrayAlphabet.getNextLetterByIndex());
        System.out.println("Result: " + arrayAlphabet.getNextLetterByLetter());

    }
}

