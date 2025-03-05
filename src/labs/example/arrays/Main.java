package labs.example.arrays;

public class Main {
    public static void main(String[] args) {
    int input[] = new int[]{1, 3, 5, 8, 9, 23, 13, 50, 49, 101, 300, 501, 593, 7, 310, 394, 591, 78, 39, 10, 43, 601, 31, 95, 91, 99, 59, 39, 99, 130, 121, 302, 400, 543, 333, 664, 777, 333, 999, 110, 304, 405, 605, 303, 201, 500, 607, 103, 609, 800};
    ArrayOperations Array = new ArrayOperations();
    Array.createNewArray(6);
    Array.sortArray(input);
    Array.getDaysAndMonths();
    }
}
