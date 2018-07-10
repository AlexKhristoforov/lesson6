public class Division implements Operation {

    public int operation(int firstNumber, int secondNumber) throws ArithmeticException{
        if (secondNumber==0) throw new ArithmeticException("Oops! You can not divide by zero!");
        return firstNumber/ secondNumber;
    }

    public String getName() {
        return "division";
    }
}
