package com.moodanalyser;
public class MoodAnalyser {

    private String message;
  //Parameterized Constructor
    public MoodAnalyser(String msg){
        this.message=msg;
      //calling analyseMood() Method
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
            return "HAPPY (Invalid Mood block)";
        }
    }
}