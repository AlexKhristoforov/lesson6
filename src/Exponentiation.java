public class Exponentiation implements Operation {
    public int operation(int firstNumber, int secondNumber) {
        return (int) Math.pow(firstNumber, secondNumber);
    }
    public String getName() {
        return "exponentiation";
    }
}
