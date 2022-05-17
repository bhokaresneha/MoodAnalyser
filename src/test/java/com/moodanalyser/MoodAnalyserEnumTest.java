package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class MoodAnalyserEnumTest {

//    @Test
//    public void analyseMood1() {
//        MoodAnalyser1 check = new MoodAnalyser1();
//        boolean result = check.analyseMood1("happy");
//        Assert.assertEquals(true, result);
//    }
//
//    @Test
//    public void givenSad_ReturnSad() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
//        String result = moodAnalyser.analyseMood();
//        String expected = "sad";
//        Assert.assertEquals(expected,result);
//    }
//    @Test
//    public void givenAny_ReturnHappy() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
//        String result = moodAnalyser.analyseMood();
//        String expected = "Happy";
//        Assert.assertEquals(expected,result);
//    }
//
//    @Test
//    public void givenNull_ReturnInvalid() {
//        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
//        String result = moodAnalyser.analyseMood();
//        String expected = null;
//        Assert.assertEquals(expected,result);
//
//    }
//
//    @Test
//    public void givenNull_ReturnhAPPY() throws MoodAnalysisException {
//        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
//        String result = moodAnalyser.analyseMood();
//        String expected = "Happy(null)";
//        assertEquals(expected,result);
//    }

    @Test
    public void testMoodAnalysis_whenMoodEmpty_ShouldThrowException() throws  MoodAnalysisException {
        MoodAnalyserEnum moodAnalyser = new MoodAnalyserEnum("");
        try {
            String result=MoodAnalyserEnum.analyseMood();
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EMPTY,result);
        } catch (MoodAnalysisException e) {
            System.out.println("Exception  "+e);
        }

    }


    @Test
    public void testMoodAnalysis_whenMoodNull_ShouldThrowException() throws MoodAnalysisException {
        MoodAnalyserEnum moodAnalyser = new MoodAnalyserEnum(null);
        try {
            String result=MoodAnalyserEnum.analyseMood();
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL,result);
        } catch (MoodAnalysisException e) {
            System.out.println("Exception  "+e);
        }

    }

}