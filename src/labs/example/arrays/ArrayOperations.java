package labs.example.arrays;

public class ArrayOperations {
    public void createNewArray(int args){
        int number[] = new int[args];
        for (int i = 0; i < number.length; i++){
            number[i] = i;
        }
        displayArray(number);
    }
    private void displayArray(int[] number){
        int args = number.length;
        System.out.println("I created a new array and now it has " + args + " items in it");
        System.out.println("The array and their items are listed below: ");
        for (int i = 0; i < number.length; i++){
            System.out.println("array numbers [" + i + "]");
        }

    }
public void sortAarray(int[] args){
    int temp[] = new int[args.length];
//new empty array is created that has the same length as the original
      int main[] = new int[args.length];
//creates an empty array that will be our main finished array
    for (int i = 0; i < args.length; i++){
//Creates a for loop that will walk down the array

       for (int f = 1; f < args.length; f++){
//creates a new for loop that will walk down the array in front of i
            int p = args[f];

           if (p < args[f + 1]){
             temp[f] = args[f + 1];
          }
          else{
                 temp[f] = p;
            }
       }
    }
for (int c = 0; c < args.length; c++)
    System.out.println(temp[c]);
 }


//selection sort
public void sortArray(int[] args){
    int a = args.length;
//creates an integar equal to the length of the array
    for (int i = 0; i < a - 1; i++){
//runs a For statement that creates and integar with the set value of 0, as long as the value is less than the array length within boundary, run the command and increment
    int max = i;
//creates an integar max that will be holding the greatest value
        for (int f = i + 1; f < args.length; f++){
//runs a For statement that creates and integar with the set value of i + 1, as long as the value is less than the array length, run the command and increment
        if (args[max] < args[f]){
//if the value at the index of max is less than that of the value at index of f
            max = f;
//max then becomes f
        }
//it keeps sifting through until it reaches the end of the array keeping the maximum value
      }
      int temp = args[max];
//the value is given to the integar temp 
        args[max] = args[i];
//the value at the index of i is given to the value at the index of max instead
        args[i] = temp;
//the value that temp held which should be the max number is then given to the index of i position
    }
    System.out.println("The array and their items are listed below: ");
        for (int i = 0; i < args.length; i++){
            System.out.println("array numbers [" + args[i] + "]");
    }

}
//Use two arrays and move them using i starting at 1 and i-1 



public void getDaysAndMonths(){
    String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for (int i = 0; i < months.length; i++){
        System.out.println("There are " + days[i] + " in " + months[i]);
    }
}
}




