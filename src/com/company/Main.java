package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String movnames = "", moviename, wrongl = "";
        int uinput = 0,vinput=0;
        moviename = MovieNamePrint.Moviename();
        Scanner Letter = new Scanner(System.in);
        vinput = Print(moviename, movnames, wrongl, 0,uinput);
        while (vinput != moviename.length() && uinput != 10) {
            System.out.print("Guess a letter:");
            //input a letter
            String in = Letter.nextLine();
            if (moviename.contains(in)) movnames = movnames + in;
            else {
                wrongl = wrongl + in;
                uinput++;
            }
            vinput=Print(moviename, movnames, wrongl, 0,uinput);
        }
        if (uinput == 10) {
            System.out.println("\nYou lose!");
        } else {
            System.out.println("You Win!");
            System.out.println("You have guessed  " + moviename + "  correctly.");
        }

    }

    public static int Print(String Letter, String names, String wrongs,int c,int uinput) {
        System.out.print("You are guessing:");
        for (int i = 0; i < Letter.length(); i++) {
            if (names.indexOf(Letter.charAt(i)) == -1)
                System.out.print("_");
            else {System.out.print(Letter.charAt(i));
                c++;}
        }
        System.out.println();
        System.out.print("You have gussed (" + uinput + ") wrong letters:");
        for (int i = 0; i < wrongs.length(); i++) {
            System.out.print(wrongs.charAt(i) + " ");
        }
        System.out.println();
        return c;


    }
}
