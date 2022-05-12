package com.moodanalyser;
public class MoodAnalyser {
    public String analyseMood(String msg)
    {
        if (msg.contains("sad"))
        {
            return "SAD";
        } else if (msg.contains("any"))
        {
            return "HAPPY";
        } else
        {
            return null;
        }
    }
}