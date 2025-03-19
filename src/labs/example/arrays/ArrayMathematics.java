package labs.example.arrays;

public class ArrayMathematics {
    public void arrayComparison(int[] firstArray, int[] secondArray){
        int length = 0; 
        int checker = 0;
        if (firstArray.length == secondArray.length){
//compares both to determine if the lengths are similar
            System.out.println("These arrays are the same length");
         } else {
            System.out.println("These arrays are not the same length");
        }
        if (firstArray.length > secondArray.length){
            length = secondArray.length;
        } else if (secondArray.length > firstArray.length){
            length = firstArray.length;
        } else {
            length = firstArray.length;
        }
//used to determine which one has to lowest length so when values are compared it will not be out of bounds
        for (int i = 0; i < length; i++){
            if (firstArray[i] != secondArray[i]){
                checker++;
            }
        }
        if (checker > 0){
            System.out.println("These arrays do not contain the same values");
        } else {
            System.out.print("These arrays contain the same values");
        }
        System.out.println("");
//uses checker to record if they have the same value and to know what to print out after the loop is ran
    }


    public void arraySum(int[] arr1, int[] arr2, int[] arr3){
        int arr1Sum = 0;
        int arr2Sum = 0;
        int arr3Sum = 0;
        for (int i = 0; i < arr1.length; i++){
            arr1Sum = arr1Sum + arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            arr2Sum = arr2Sum + arr2[i];
        }
        for (int i = 0; i < arr3.length; i++){
            arr3Sum = arr3Sum + arr3[i];
        }
        //finds sum of all the arrays
        System.out.println("The 1st array's sum is " + arr1Sum);
        System.out.println("The 2nd array's sum is " + arr2Sum);
        System.out.println("The 3rd array's sum is " + arr3Sum);
        //prints the sums
        if (arr1Sum > arr2Sum && arr1Sum > arr3Sum){
            System.out.print("The 1st array has the largest sum");
        } else if (arr2Sum > arr1Sum && arr2Sum > arr3Sum){
            System.out.print("The 2nd array has the largest sum");
        } else if (arr3Sum > arr1Sum && arr3Sum > arr2Sum){
            System.out.print("The 3rd array has the largest sum");
        } else {
            System.out.println("They are equal");
        }
        //compares to find the largest else equal
        System.out.println("");
    }

    public void largestSumInArray(int[] myArray){
        int j = 0;
        for (int i = 0; i < myArray.length; i++){
            if (j < myArray[i]){
                j = myArray[i];
            }
        }
        System.out.println("The largest value in myArray is: " + j);
    }

    public void arrayMod10Check(int[] cardNumber){
        int temp = 0;
        int doubleDigitCheck = 0;
        int doubleDigitCheck2 = 0;
        int doubleDigitSum = 0;
        int cardSum = 0;
        int cardValidCheck = 0;
        int cardReverse[] = new int[cardNumber.length];
        int p = 0;
        for (int l = cardNumber.length - 1; l + 1 > 0; l--){
            cardReverse[p] = cardNumber[l];
            p++;
        }
//reverses the card number
        for (int i = 0; i < cardNumber.length; i++){
        if ((i + 1) % 2 == 0){
            cardSum = cardReverse[i] + cardSum;
//if at an even position, add the cardnumber directly to the cardsum
        }
            else if ((i + 1) % 2 == 1){
//if at an odd number
                temp = cardReverse[i] * 2;
//temp = cardnumber times 2
                if (temp > 9){
//if the resulting temp is greater than 9
                doubleDigitCheck = temp % 10;
//find the first digit using the remainder after dividing by 10
                doubleDigitCheck2 = temp / 10;
//find the second digit by dividing by 10
                doubleDigitSum = doubleDigitCheck + doubleDigitCheck2; 
//adds it together
                cardSum = doubleDigitSum + cardSum;
//add that to cardsum
                } else {
                cardSum = temp + cardSum;
//if temp is not over 9 add it directly to cardsum
                }
        }
    }
    cardValidCheck = cardSum % 10;
        if (cardValidCheck == 0){
            System.out.println("This is a valid card");
        } else {
            System.out.println("This is not a valid card");
        }
        System.out.println(cardSum);
}
}
