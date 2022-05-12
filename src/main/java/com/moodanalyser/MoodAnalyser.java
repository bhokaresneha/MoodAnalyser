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
        if (message.contains("sad"))
        {
            return "SAD";
        } else if (message.contains("any"))
        {
            return "HAPPY";
        } else
        {
            return null;
        }
    }
}