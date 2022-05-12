package com.moodanalyser;
public class MoodAnalyser {
    public String analyseMood(String msg){
        if(msg.contains("sad"))
        {
            return "SAD";
        }
        return null;
    }
}