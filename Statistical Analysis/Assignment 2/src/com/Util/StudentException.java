package com.Util;

/**
 * Created by felixamoruwa on 5/31/15.
 */
public class StudentException extends Exception {

    public StudentException() {
    };

    public StudentException(String message) {
        super(message);
    }

    public StudentException(Throwable throwable) {
        super(throwable);
    }

    public StudentException(String message, Throwable throwable) {
        super(message, throwable);
    }
}