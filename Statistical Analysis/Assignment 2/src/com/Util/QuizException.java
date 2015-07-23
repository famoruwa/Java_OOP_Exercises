package com.Util;

/**
 * Created by felixamoruwa on 5/31/15.
 */
public class QuizException extends Exception {

    public QuizException() {
    }

    public QuizException(String message) {
        super(message);
    }

    public QuizException(Throwable throwable) {
        super(throwable);
    }

    public QuizException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
