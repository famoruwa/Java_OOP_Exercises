package com.Util;

import java.util.Arrays;

/**
 * Created by felixamoruwa on 5/31/15.
 */
public class ScoredStudent extends Student{

    private int scSID;
    private int scScores[] = new int[5];


    public ScoredStudent(int scSID, int[] scScores) {
        super();
        this.scSID = scSID;
        this.scScores = scScores;
    }

    public int getScSID() {
        return scSID;
    }

    public void setScSID(int scSID) {
        this.scSID = scSID;
    }

    public int[] getScScores() {
        return scScores;
    }

    public void setScScores(int[] scScores) {
        this.scScores = scScores;
    }

    public void printScSID(){
        System.out.println(scSID);
    }

    public void printScScores(){
        System.out.println(scScores);
    }

    public int getIndScore(int position) {
        return this.scScores[position];
    }

    public void setIndScores(int score, int position) {
        this.scScores[position] = score;
    }

    public void studentReport() {
        System.out.print(this.getSID() + "\t");
        int[] var4 = this.scScores;
        int var3 = this.scScores.length;

        for(int var2 = 0; var2 < var3; var2++) {
            int score = var4[var2];
            System.out.print("\t" + score);
        }

        System.out.println();
    }
    @Override
    public String toString() {
        return "ScoredStudent{" +
                "scSID=" + scSID +
                ", scScores=" + Arrays.toString(scScores) +
                '}';
    }
}
