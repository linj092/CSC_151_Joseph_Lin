package labs.example.arrays;

public class Main {
    public static void main(String[] args) {
    int input[] = new int[]{1, 3, 5, 8, 9, 23, 13};
    ArrayOperations Array = new ArrayOperations();
    Array.createNewArray(6);
    Array.sortArray(input);
    Array.getDaysAndMonths();
    }
}
