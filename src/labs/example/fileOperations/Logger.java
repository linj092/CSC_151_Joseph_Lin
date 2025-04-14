package labs.example.fileOperations;

import java.io.*;
import java.util.ArrayList;
import java.lang.*;
import java.lang.reflect.Array;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
public class Logger {
    private static final String FILE_PATH = "C:/CSC_151_Joseph_Lin/src/labs/example/fileOperations/Error_Files_CSC";
    private static final String ERROR_LOG_FILE = FILE_PATH + "/logs/api_error.log";
    private static final String HTTP_ACCESS_LOG = FILE_PATH + "/logs/http_access.log";
    public static void main(String[] args)throws IOException{
        openErrorLog();
        BufferedReader br = openErrorLog();
        getCountOfErrorTypes(br);
        br.close();
        BufferedReader br2 = openErrorLog();
        getMemoryLimitExceededCount(br2);
        br2.close();
        BufferedReader br3 = openErrorLog();
        getDiskSpaceErrorsWithIPAddresses(br3);
        BufferedReader br4 = openErrorLog("http_access_log");
        getGMToffset(br4);
        BufferedReader br5 = openErrorLog("http_access_log");
        getHTTPCodes(br5);
        BufferedReader br6 = openErrorLog("http_access_log");
        getResponseSizes(br6);
        BufferedReader br7 = openErrorLog("http_access_log");
        groupHTTPMethodsAndEndPoints(br7);
    }

    public static BufferedReader openErrorLog(){
        File log_file = new File(ERROR_LOG_FILE);
        //String line = " ";
        BufferedReader reader = null; //new BufferedReader(null);
        if (log_file.exists()){
            try{
            reader = new BufferedReader(new FileReader(log_file));
            return reader;
            }catch(IOException e){

            }
    }return reader;
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
    private static void getDiskSpaceErrorsWithIPAddresses(BufferedReader logReader){
        String line = "";
        int count = 0;
        int i = 0;
        ArrayList<String> address = new ArrayList<String>();
        ArrayList<Integer> location = new ArrayList<Integer>();
        try{
            while ((line = logReader.readLine()) != null){
                String value[] = line.split(" ");
                if (value[5].equals("Disk") && (value[6].equals("space") && (value[7].equals("running")) && (value[8].equals("low")))){
                    address.add(value[3]);
                    location.add(count);
                }
                count++;
            }} catch (IOException e){
                    
            } for (i = 0; i < address.size(); i++){
                System.out.println("Disk space error on line " + location.get(i) + " for IP address " + address.get(i));
            }
    }
    public static BufferedReader openErrorLog(String x){
        File log_file = new File(HTTP_ACCESS_LOG);
        BufferedReader reader = null; //new BufferedReader(null);
        if (x.equals("http_access_log")){
        if (log_file.exists()){
            try{
            reader = new BufferedReader(new FileReader(log_file)); 
            return reader;
            }catch(IOException e){

            }}
    }return reader;
}
    private static void getGMToffset(BufferedReader logReader){
        ArrayList<String> address = new ArrayList<String>();
        ArrayList<Integer> location = new ArrayList<Integer>();
        String line = "";
        int count = 0;
        int check = 0;
        try{
            logReader.mark(10000000);
            while ((line = logReader.readLine()) != null){
                String value[] = line.split(" ");
                String hold[] = value[4].split("]");
                
                if (address.size() == 0){
                    address.add(hold[0]);
                } else {
                    for (int i = 0; i < address.size(); i++){
                        if (hold[0].equals(address.get(i))){
                            check++;
                        }
                    }
                if (check == 0){
                    address.add(hold[0]);
                }
            check = 0;
        }
            }
            logReader.reset();
            for (int j = 0; j < address.size(); j++) {
                while ((line = logReader.readLine()) != null){
                    String place[] = line.split(" ");
                    String hold2[] = place[4].split("]");
                if (hold2[0].equals(address.get(j))){
                    count++;
                }
             }
                System.out.println("There are " + count + " GMT " + (address.get(j)));
                count = 0;
                logReader.reset();
            }
        } catch (IOException e){
                
            
            }
            
    }
    private static void getHTTPCodes(BufferedReader logReader){
        String hold;
        String line;
        int temp;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        try {
            while ((line = logReader.readLine()) != null){
                String value[] = line.split(" ");
                hold = value[8];
                temp = Integer.parseInt(hold);
                if (temp >= 100 && temp <= 199){
                    count1++;
                } else if (temp >= 200 && temp <= 299){
                    count2++;
                } else if (temp >= 300 && temp <= 399){
                    count3++;
                } else if (temp >= 400 && temp <= 499){
                    count4++;
                } else if (temp >= 500 && temp <= 599){
                    count5++;
                }
            }
            System.out.println("1xx Errors:" + count1);
            System.out.println("2xx Errors:" + count2);
            System.out.println("3xx Errors:" + count3);
            System.out.println("4xx Errors:" + count4);
            System.out.println("5xx Errors:" + count5);
        } catch (IOException e) {
        }
    }
    private static void getResponseSizes(BufferedReader logReader){
        String hold;
        String line;
        int temp;
        int count = 0;
        try {
        while ((line = logReader.readLine()) != null){
            String value[] = line.split(" ");
                hold = value[9];
                temp = Integer.parseInt(hold);
                if (temp > 3900){
                    count++;
                }
    }
    System.out.println("There are " + count + " response sizes > 3900");
} catch (IOException e){}
}
private static void groupHTTPMethodsAndEndPoints(BufferedReader logReader){
    ArrayList<String> address = new ArrayList<String>();
        String line = "";
        int count = 0;
        int check = 0;
        try{
            while ((line = logReader.readLine()) != null){
                String value[] = line.split(" ");
                String hold[] = value[5].split("");
                String hold2[] = new String[hold.length - 1];
                for(int i = 1; i < hold.length; i++){
                    hold2[i-1] = hold[i];
                }
                String hold3 = String.join("", hold2);
                if (address.size() == 0){
                    address.add(hold3);
                } else {
                    for (int i = 0; i < address.size(); i++){
                        if (hold3.equals(address.get(i))){
                            check++;
                        }
                    }
                if (check == 0){
                    address.add(hold3);
                }
            check = 0;
        }
            }
            System.out.println("The HTTP verbs used in this file are:");
            for (int j = 0; j < address.size(); j++){
                System.out.println((address.get(j)));
            }
        } catch (IOException e){
                
            
            }
            
}
}