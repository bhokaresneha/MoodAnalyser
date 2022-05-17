package com.moodanalyser;

public class MoodAnalysisException extends Exception{
    enum ExceptionType{
        NULL,
        EMPTY;

    }
    //  public static Object ExceptionType;
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type,String message) {
        super(message);
        this.type=type;

    }
}
