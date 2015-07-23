package com.Util;
//package lab2;


import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Statistics implements ScoredStudentStatsInt{

    private int[] lowscores = new int[5];
    private int[] highscores = new int[5];
    private float[] avgscores = new float[5];


    private int max;
    private int min;
    private float avg;
    private float counter = 0;

    public Statistics(){

    };

    public Statistics(ScoredStudent[] student){

        this.findlow(student);
        this.findhigh(student);
        this.findavg(student);
    }
   public void findlow(ScoredStudent[] student) {

        //This method will find lowest score and store it in an array names lowscores }

        for(int i = 0; i < this.lowscores.length; i++) {
            for(int j = 0; j < student.length; j++) {
                if(student[j] == null) {
                    j = student.length;
                } else if(j == 0) {
                    this.lowscores[i] = student[j].getIndScore(i);
                } else if(this.lowscores[i] > student[j].getIndScore(i)){
                    this.lowscores[i] = student[j].getIndScore(i);
                }
            }
        }
    }

    public void findhigh(ScoredStudent[] student) {

        //This method will find highest score and store it in an array names highscores

        for(int i = 0; i < this.highscores.length; i++) {
            for(int j = 0; j < student.length; j++) {
                if(student[j] == null) {
                    j = student.length;
                } else if(j == 0) {
                    this.highscores[i] = student[j].getIndScore(i);
                } else if(this.highscores[i] < student[j].getIndScore(i)){
                    this.highscores[i] = student[j].getIndScore(i);
                }
            }
        }
    }

    public void findavg(ScoredStudent[] student) {

        //This method will find avg score for each quiz and store it in an array names avgscores

        int numberOfStudents = 40;

        for(int i = 0; i < this.avgscores.length; i++) {
            for(int j = 0; j < student.length; j++) {
                if(student[j] == null) {
                    numberOfStudents = j;
                    j = student.length;
                } else {
                    this.avgscores[i] += (float)student[j].getIndScore(i);
                }
            }

            this.avgscores[i] /= (float)numberOfStudents;
        }
    }

    //add methods to print values of instance variables.

    public void avgOutput(){
        System.out.println(avg);
    }
    public void maxOutput(){
        System.out.println(max);
    }
    public void minOutput(){
        System.out.println(min);
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "avgscores=" + Arrays.toString(avgscores) +
                ", highscores=" + Arrays.toString(highscores) +
                ", lowscores=" + Arrays.toString(lowscores) +
                '}';
    }

    public void classReport() {
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.print("Low Score:" + "     ");
        int[] var5 = this.lowscores;
        int var4 = this.lowscores.length;
        int score;
        int var3;
        for(var3 = 0; var3 < var4; var3++) {
            score = var5[var3];
            System.out.print(" " + score);
        }
        System.out.println();
        System.out.print("High Score: " + "   ");
        var5 = this.highscores;
        var4 = this.highscores.length;

        for(var3 = 0; var3 < var4; var3++) {
            score = var5[var3];
            System.out.print(" " + score);
        }
        System.out.println();
        System.out.print("Average Score: ");
        float[] var7 = this.avgscores;
        var4 = this.avgscores.length;

        for(var3 = 0; var3 < var4; var3++) {
            float var6 = var7[var3];
            System.out.print(" " + df.format((double)var6));
        }
        System.out.println();
    }
}


