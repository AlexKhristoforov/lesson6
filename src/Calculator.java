import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private Operation[] operations = new Operation[6];
    Scanner scanner = new Scanner(System.in);
    public Calculator() {
        operations[0] = new Addition();
        operations[1] = new Subtraction();
        operations[2] = new Multiplication();
        operations[3] = new Division();
        operations[4] = new Exponentiation();
        operations[5] = new RootSquaring();
    }

    public String getResult(int i) throws ArithmeticException,RootDegreeException {
            int firstNumber = initFirstNumber(i);
            int secondNumber = initSecondNumber(i);
            String operationName = operations[i - 1].getName();
            int result = operations[i - 1].operation(firstNumber, secondNumber);
            return "The result of " + operationName + " is: " + result;
    }

    private int initFirstNumber(int i) throws InputMismatchException {
        if (i < 5) {
            System.out.println("Input the first number:");
            return scanner.nextInt();
        } else {
            System.out.println("Input the number:");
            return scanner.nextInt();
        }
    }

    private int initSecondNumber(int i) throws InputMismatchException {
        if (i < 5) {
            System.out.println("Input the second number:");
            return scanner.nextInt();
        } else if (i == 6) {
            System.out.println("Input the degree of the number:");
            return scanner.nextInt();
        } else System.out.println("Input the degree of the root of the number:");
        return scanner.nextInt();
    }
}
