package labs.example.fileOperations;

import java.io.*;



public class FileOperator {

    private static final String FILE_PATH = "C:/CSC_151_Joseph_Lin/src/labs/example/fileOperations/Error_Files_CSC";
    private static final String FILE_NAME = FILE_PATH + "/files/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "/logs/api_error.log";
    //creates the path
    

    public void main(){
    openCSVFile();
    printErrorLog();
}

    
    public void openCSVFile(){
        String names[] = new String[3];
        double grades[] = new double[3];
        int i = 0;
        File csv_file = new File(FILE_NAME);
        File log_file = new File(ERROR_LOG_FILE);
        //creates new variables
      try {

            if(csv_file.exists() && log_file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
                //if both files exist read through the user.csv file (opens it)
                String line = "";
                int count = 0;
                int p = 0;
                while((line = br.readLine()) != null){
                //while the read line is NOT null
                    if(count > 0){
                        int sum = 0;
                        double average = 0.0;
                        String[] value = line.split(",");
                        names[i] = value[0];
                        i++;
                        for (int k = 1; k < 4; k++){
                            sum = Integer.parseInt(value[k]) + sum;
                        }
                        average = (double)Math.round((sum*100)/3)/100;
                        grades[p] = average;
                        p++;
                       }
                    //used count to skip the headers, the names which are at the 0th position of value is put into another array.
                    //The grades are converted into integers and summed up and placed into a grades array.
                    count++;
                }


            }
            
        } catch (IOException e) {

        }
        for (int o = 0; o < names.length; o++){
            System.out.println(names[o] + "'s average grade is " + grades[o]);
        }
    }
    public void printErrorLog(){
        File csv_file = new File(FILE_NAME);
        File log_file = new File(ERROR_LOG_FILE);
        if (csv_file.exists()){
            try{
            BufferedReader reader = new BufferedReader(new FileReader(log_file));
            String line = " ";
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                }
            }catch(IOException e){

            }
    }
    }
}