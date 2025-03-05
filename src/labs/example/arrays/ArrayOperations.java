package labs.example.arrays;

public class ArrayOperations {
    public void createNewArray(int args){
        int number[] = new int[args];
        for (int i = 0; i < number.length; i++){
            number[i] = i + 1;
        }
        displayArray(number);
    }
    private void displayArray(int[] number){
        int args = number.length;
        System.out.println("I created a new array and now it has " + args + " items in it");
        System.out.println("The array and their items are listed below: ");
        for (int i = 0; i < number.length; i++){
            System.out.println("array item [" + i + "]");
        }

    }
public void sortArray(int[] args){
for (int j = 0; j < args.length; j++){
    for (int i = 1; i < args.length; i++){
    if (args[i] > args[i - 1]){
        int temp = args[i - 1];
        args[i - 1] = args[i];
        args[i] = temp;

}
    }
  }
    System.out.println("The array and their items are listed below: ");
  for (int i = 0; i < args.length; i++){
        System.out.println("array position " + i + " [" + args[i] + "]");
}
 }








public void getDaysAndMonths(){
    String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    System.out.println("These are the months and days");
    for (int i = 0; i < months.length; i++){
        System.out.println("There are " + days[i] + " in " + months[i]);
    }
}
}




