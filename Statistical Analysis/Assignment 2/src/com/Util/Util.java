package com.Util;

//package lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


/**
 * Created by felixamoruwa on 5/24/15.
 */

public class Util {

    /* private int[] scorevalue = new int[5]; */

    private static int j = 0; // Total number of Students taking Quizzes

    public static ScoredStudent[] readFile(String filename, ScoredStudent[] student) throws StudentException, QuizException {

        //Reads the file and builds student array.
        //Open the file using FileReader Object.
        //In a loop read a line using readLine method.
        //Tokenize each line using StringTokenizer Object

       // Student stud[] = new Student[40]; //Populate the student array
       // ScoredStudent scstud[] = new ScoredStudent[40];//Populate the scored student array

        try {
            FileReader file = new FileReader("/Users/felixamoruwa/Desktop/ReadSource.txt");
            BufferedReader buff = new BufferedReader(file);
            buff.readLine();
            System.out.println("Stud Qu1 Qu2 Qu3 Qu4 Qu5");
            System.out.println("------------------------");
            boolean eof = false;

            try {
                while ((!eof) || (j <= 40)) {
                    String line = buff.readLine();
                    int[] scores = new int[5];
                    if ((line != null) & (j == 40)){
                        throw new StudentException("Error: There are no more students to accept as input.");
                    }

                    if (line == null)  {
                        eof = true;
                    } else {
                        System.out.println(line);
                       // stud[j] = new Student();
                        StringTokenizer st = new StringTokenizer(line);
                        int sid = Integer.parseInt(st.nextToken());
                        //stud[j].setSID(sid);
                        for (int z = 0; st.hasMoreTokens(); z++) {
                            if (z == 5) {
                                throw new QuizException("Error: There are only 5 quizzes allowed as input.");
                            }
                            scores[z] = Integer.parseInt(st.nextToken());
                        }
                        //stud[j].setScores(scores);
                        //stud[j].printSID();
                        //stud[j].printScores();
                        student[j] = new ScoredStudent(sid, scores);
                    }
                    //scstud[j].setScSID(stud[j].getSID());
                    //scstud[j].printScSID();
                    //scstud[j].setScScores(stud[j].getScores());
                    //stud[j].printScores();
                    //scstud[j].printScScores();
                    j = j + 1;
                    //System.out.println(j);
                }
            } catch (NullPointerException e){
                System.out.println(e.getMessage());
            } catch (IOException e){
                System.out.println(e.getMessage());
            } catch (StudentException e){
                System.out.println(e.getMessage());
            } catch (QuizException e){
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            buff.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
           // System.out.println("Error ­­ " + e.toString());
        }
        return student;


    }
}


