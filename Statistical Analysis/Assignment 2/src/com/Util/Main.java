
package com.Util;

/**
 * Created by felixamoruwa on 5/24/15.
 */
public class Main {
    public Main() {
    };

    public static void main(String[] args) {

        try {
            ScoredStudent[] student1 = new ScoredStudent[40];
            student1 = Util.readFile("/Users/felixamoruwa/Desktop/ReadSource.txt",student1);
            Statistics statslab2 = new Statistics(student1);
            System.out.println();
            System.out.println("Stud\tQ1\tQ2\tQ3\tQ4\tQ5");

            for(int i = 0; i < 40; ++i) {
                if(student1[i] == null) {
                    i = student1.length;
                } else {
                    student1[i].studentReport();
                }
            }
            System.out.println();
            statslab2.classReport();

        } catch (StudentException e) {
            e.printStackTrace();
        } catch (QuizException e) {
            e.printStackTrace();
        }

        //System.out.println();
        //add calls to findhigh and find average //Print the data and statistics
        //System.out.println("High Score: " +  "Quiz1High " + "Quiz2High " + "Quiz3High " + "Quiz4High " + "Quiz5High ");
        //System.out.println("Low Score: " + " Quiz1Low " + " Quiz2Low " + " Quiz3Low " + " Quiz4Low " + " Quiz5Low ");
        //System.out.println("Avg Score: " + " Quiz1Avg " + " Quiz2Avg " + " Quiz3Avg " + " Quiz4Avg " + " Quiz5Avg ");
    }
}
