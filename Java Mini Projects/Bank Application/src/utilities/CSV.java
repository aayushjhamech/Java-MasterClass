package utilities;

import java.io.*;
import java.lang.management.BufferPoolMXBean;
import java.util.*;

public class CSV {

    public static List<String[]> read(String file){
        List<String[]> data= new LinkedList<String[]>();
        String dataRow;
        try{
            BufferedReader br= new BufferedReader(new FileReader(file));
            while((dataRow= br.readLine()) != null){
                String[] dataRecords= dataRow.split(",");
                data.add(dataRecords);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not FInd FILE");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Could not read File");
            e.printStackTrace();
        }
        return data;
    }
}
