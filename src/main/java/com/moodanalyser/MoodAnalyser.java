package com.moodanalyser;
public class MoodAnalyser {

    private String message;
    public MoodAnalyser(String msg){
        this.message=msg;
        analyseMood();

    }
    public String analyseMood()
    {
        try
        {
            if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e)
        {
            return null;
        }
    }
}