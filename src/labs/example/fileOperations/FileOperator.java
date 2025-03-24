package labs.example.fileOperations;

import java.io.*;
import java.util.*;
import java.util.stream.Gatherer;


public class FileOperator {

    private static final String FILE_PATH = "C:/CSC_151_Joseph_Lin/src/labs/example/fileOperations/Error_Files_CSC";
    private static final String FILE_NAME = FILE_PATH + "/files/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "/logs/api_error.log";
    
    public static void main() {
        //call and open() file method
        openCSVFile();
    }
    
    private static void openCSVFile(){
        String names[] = new String[3];
        double grades[] = new double[3];
        int i = 0;
        File csv_file = new File(FILE_NAME);
        File log_file = new File(ERROR_LOG_FILE);
      try {
            BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(ERROR_LOG_FILE,true));
            if(csv_file.exists() && log_file.exists()){
                BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
                String line = "";
                int count = 0;
                String message = "";
                int p = 0;
                while((line = br.readLine()) != null){
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
                    count++;
                }

                csv_file_writer.close();

            }
            
        } catch (IOException e) {

        }
        for (int o = 0; o < names.length; o++){
            System.out.println(names[o] + "'s average grade is " + grades[o]);
        }
    }
}
