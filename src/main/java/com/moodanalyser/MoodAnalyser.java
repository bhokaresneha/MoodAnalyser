package com.moodanalyser;
public class MoodAnalyser {

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println("Welcome to MoodAnalyser:");
        String str = "I am in sad mood";
        System.out.println("Message=>" +str);
        //calling analyseMood() Method and passing message as a parameter to the method
        String result=moodAnalyser.analyseMood(str);
        System.out.println("Result=>"+result );
    }

    private String analyseMood(String str) {
        String substr="sad";
        String mood = "";
        //str.indexof()-method returns the index within this string of the first occurrence of the specified substring.
        int i = str.indexOf(substr);
        //System.out.println(i);
        if(i>0) {
            mood = "SAD";
        }
        else {
            mood = "HAPPY";
        }
        return mood;
    }
}