import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        Calculator calculator = new Calculator();
        int i = 0;
        do {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                i = menu();
                if (i != 7) {
                    System.out.println(calculator.getResult(i));
                    System.out.printf("\nPlease press Enter to  to return to the menu.");
                    System.in.read();
                }
            } catch (IllegalArgumentException | InputMismatchException | ArithmeticException | RootDegreeException e) {
                if (e.getClass() == InputMismatchException.class) {
                    LOGGER.log(Level.INFO, "An incorrect value was entered");
                    break;
                }
                LOGGER.log(Level.INFO, e.getMessage());
                break;
            }
        } while (i != 7);
    }

    private static int menu() throws IllegalArgumentException, InputMismatchException {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Choice one of the operation and press:\n" +
                "1 - to addition;\n" +
                "2 - to subtraction;\n" +
                "3 - to multiplication;\n" +
                "4 - to division;\n" +
                "5 - to exponentiation;\n" +
                "6 - to root squaring;\n" +
                "7 - to exit.\n");
        int i = scan.nextInt();
        if (i > 7 || i < 0) throw new IllegalArgumentException("There are no suitable numbers in menu!");
        return i;
    }
}