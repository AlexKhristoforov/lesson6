public interface Operation {
    int operation(int firstNumber, int b)throws IllegalArgumentException, RootDegreeException;
    String getName();
}
