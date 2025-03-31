package labs.example.fileOperations;

import java.io.*;
import java.util.ArrayList;
public class Logger {
    private static final String FILE_PATH = "C:/CSC_151_Joseph_Lin/src/labs/example/fileOperations/Error_Files_CSC";
    private static final String FILE_NAME = FILE_PATH + "/files/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "/logs/api_error.log";
    public static void main() throws IOException{
        openErrorLog();
        BufferedReader br = openErrorLog();
        getCountOfErrorTypes(br);
        br.close();
        BufferedReader br2 = openErrorLog();
        getMemoryLimitExceededCount(br2);
        br2.close();
    }
    public static BufferedReader openErrorLog() throws IOException{
        File log_file = new File(ERROR_LOG_FILE);
        String line = " ";
    //    BufferedReader reader = new BufferedReader(null);
     //   if (log_file.exists()){
            //try{
            BufferedReader reader = new BufferedReader(new FileReader(log_file));
            return reader;
           // }catch(IOException e){

           // }
        // return reader;
    }
    public static void getCountOfErrorTypes(BufferedReader logReader){
        String line = "";
        int errorCount = 0;
        int infoCount = 0;
        int debugCount = 0;
        int warnCount = 0;
        try{
        while ((line = logReader.readLine()) != null){
            String value[] = line.split(" ");
            if (value[2].equals("[ERROR]")){
                errorCount++;
            } else if (value[2].equals("[WARN]")){
                warnCount++;
            } else if (value[2].equals("[INFO]")){
                infoCount++;
            } else if (value[2].equals("[DEBUG]")){
                debugCount++;
            }
            }
        } catch (IOException e){
                
        } 
        System.out.println("There are " + errorCount + " errors in this log file");
        System.out.println("There are " + warnCount + " warns in this log file");
        System.out.println("There are " + infoCount + " infos in this log file");
        System.out.println("There are " + debugCount + " debugs in this log file");
    }
    private static void getMemoryLimitExceededCount(BufferedReader logReader){
        String line = "";
        int count = 0;
        int i = 0;
        ArrayList<String> endPoints = new ArrayList<String>();
        ArrayList<Integer> location = new ArrayList<Integer>();
        try{
            while ((line = logReader.readLine()) != null){
                String value[] = line.split(" ");
                if (value[5].equals("Memory") && (value[6].equals("limit") && (value[7].equals("exceeded")))){
                    endPoints.add(value[13]);
                    location.add(count);
                }
                count++;
            }} catch (IOException e){
                    
            } for (i = 0; i < endPoints.size(); i++){
                System.out.println("Memory limits occurred on line " + location.get(i) + " with the endpoint of " + endPoints.get(i));
            }
    }
}
