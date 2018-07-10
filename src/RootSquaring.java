public class RootSquaring implements Operation {
    public int operation(int firstNumber, int secondNumber) throws RootDegreeException {
        if (secondNumber % 2 == 0 && firstNumber < 0) {
            throw new RootDegreeException("A root of even degree can be calculated only for a positive number");
        }
        return (int) Math.exp(Math.log(firstNumber) / secondNumber);
    }

    public String getName() {
        return "root squaring";
    }
}
