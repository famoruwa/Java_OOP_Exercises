package com.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by felixamoruwa on 5/24/15.
 */
//ReadSource.java ­­ shows how to work with readLine and FileReader
public class ReadSource {

    public static void main(String[] arguments) {

        System.out.println("Reading file from Java code...");
        System.out.println();

        try {
            FileReader file = new FileReader("/Users/felixamoruwa/Desktop/ReadSource.txt");
            BufferedReader buff = new BufferedReader(file);
            boolean eof = false;
            while (!eof) {
                String line = buff.readLine();
                if (line == null)
                    eof = true;
                else
                    System.out.println(line);
            }
            buff.close();
        } catch (IOException e) {
            System.out.println("Error ­­ " + e.toString());
        }

        //Each token is converted from String to Integer using parseInt method
        // Value is then saved in the right property of Student Object.
        //int x = Integer.parseInt(st);

        /**

         System.out.println("High Score: " + "Quiz1High " + "Quiz2High " + "Quiz3High " + "Quiz4High " + "Quiz5High ");
         System.out.println("Low Score: " + " Quiz1Low " + " Quiz2Low " + " Quiz3Low " + " Quiz4Low " + " Quiz5Low ");
         System.out.println("Avg Score: " + " Quiz1Avg " + " Quiz2Avg " + " Quiz3Avg " + " Quiz4Avg " + " Quiz5Avg ");
         **/
    }

}
