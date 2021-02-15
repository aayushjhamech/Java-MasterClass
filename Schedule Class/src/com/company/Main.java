package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class InputSubject implements Comparable<InputSubject>{
    String subject;
    String startTime;
    String endTime;
    InputSubject(){

    }
    InputSubject(String subject, String startTime, String endTime){
        this.subject = subject;
        this.startTime = startTime;
        this.endTime =  endTime;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    @Override
    public int compareTo(InputSubject o) {

        return this.endTime.compareTo(o.endTime);
    }

}

public class Main {

    static int getToatlSubject(List<InputSubject> list){
        String sTime = null;
        String eTime =  null;
        int count = 0;
        int noOfSubject = 0;
        for(InputSubject object : list){
            if(count == 0){
                count++;
                eTime = object.getEndTime();
                noOfSubject ++;
            }
            else {
                if(object.getStartTime().compareTo(eTime) >= 0){
                    eTime = object.getEndTime();
                    noOfSubject ++;
                }
            }
        }
        return noOfSubject;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int test = Integer.parseInt(reader.readLine());
            for(int i = 0 ; i < test ;i++){
                int sub = Integer.parseInt(reader.readLine());
                List<InputSubject> list = new ArrayList<>();
                for(int k = 0 ; k < sub ; k++){
                    InputSubject inputSubject = null;
                    String subDetails =  reader.readLine();
                    String[] subAndTimes = subDetails.split(" ");
                    inputSubject = new InputSubject(subAndTimes[0],subAndTimes[1],subAndTimes[2]);
                    list.add(inputSubject);
                }
                Collections.sort(list);
                System.out.println(getToatlSubject(list));
            }

        } catch (Exception e) {
        }

    }

}