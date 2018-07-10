import java.util.InputMismatchException;

public class Multiplication implements Operation {
    public int operation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public String getName() {
        return "multiplication";
    }
}
