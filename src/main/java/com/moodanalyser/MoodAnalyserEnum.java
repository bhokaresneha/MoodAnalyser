package com.moodanalyser;

public class MoodAnalyserEnum {
    public static String message;

    public MoodAnalyserEnum(String message) throws MoodAnalysisException {
        this.message = message;

    }

    public static String analyseMood() throws MoodAnalysisException {

        try {
            if (message.length() == 0) {
                System.out.println("Empty Exception Occured");
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "");
            }else if (message.contains("Sad"))
                return "SAD";
            else if (message.contains("Happy"))
                return "HAPPY";
            else
                return null;
        } catch(NullPointerException e) {
            System.out.println("Null Pointer Exception");
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL ,"");
        }

    }
}