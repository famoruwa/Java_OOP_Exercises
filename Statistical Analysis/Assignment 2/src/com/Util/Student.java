package com.Util;
//package lab2;

/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Student {

    private int SID;
    private int scores[] = new int[5];
    //write public get and set methods for
    //SID and scores
    //add methods to print values of instance variables.

    public int getSID() {

        return this.SID;
    }

    public void setSID(int SID) {

        this.SID = SID;
    }

    public int[] getScores() {
        return this.scores;

    }
    public int getIndScore(int position) {
        return this.scores[position];
    }

    public void setIndScores(int score, int position) {
        this.scores[position] = score;
    }
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void printSID(){
        System.out.println("" + SID);
    }

    public void printScores(){
        System.out.println("" + scores);
    }
}
