package labs.example.arrays;

public class Main {
    public static void main(String[] args) {
    //int input[] = new int[]{1, 3, 5, 8, 9, 23, 13, 50, 49, 101, 300, 501, 593, 7, 310, 394, 591, 78, 39, 10, 43, 601, 31, 95, 91, 99, 59, 39, 99, 130, 121, 302, 400, 543, 333, 664, 777, 333, 999, 110, 304, 405, 605, 303, 201, 500, 607, 103, 609, 800};
    //ArrayOperations Array = new ArrayOperations();
    //Array.createNewArray(6);
    //Array.sortArray(input);
    //Array.getDaysAndMonths();
    int firstArrayInput[] = new int[]{4, 6, 8, 1, 2, 4, 34, 23, 61, 71, 24, 12, 41, 11, 51, 1, 2, 3, 4, 71, 12, 11, 21, 41, 61};
    int secondArrayInput[] = new int[]{4, 6, 8, 1, 2, 4, 34, 23, 61, 71, 24, 12, 41, 11, 51, 1, 2, 3, 4, 71, 12, 11, 21, 41, 61, 51, 31};
    int thirdArrayInput[] = new int[]{4, 6, 8, 1, 2, 4, 34, 23, 61, 71, 24, 12, 41, 11, 51, 1, 2, 3, 4, 71, 12, 11, 21, 41, 61, 34, 141, 52, 13};
    int myArrayInput[] = new int[]{4, 6, 8, 1, 2, 4, 34, 23, 61, 71, 24, 12, 41, 11, 51, 1, 2, 3, 4, 71, 12, 11, 21, 41, 61, 34, 141, 52, 13, 5, 1, 3, 5, 6, 15, 51, 12, 616, 21, 34, 52, 31, 61, 73, 99, 12, 34, 61, 1, 61, 72, 84, 95, 12, 43, 45};
    ArrayMathematics ArrayMath = new ArrayMathematics();
    ArrayMath.arrayComparison(firstArrayInput, secondArrayInput);
    ArrayMath.arraySum(firstArrayInput, secondArrayInput, thirdArrayInput);
    ArrayMath.largestSumInArray(myArrayInput);
    int creditCardTest1[] = new int[]{4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    int creditCardTest2[] = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 4,};
    int creditCardTest3[] = new int[]{3, 7, 8, 2, 8, 2, 2, 4, 6, 3, 1, 0, 0, 0, 5};
    ArrayMath.arrayMod10Check(creditCardTest1);
    ArrayMath.arrayMod10Check(creditCardTest2);
    ArrayMath.arrayMod10Check(creditCardTest3);
    }
}