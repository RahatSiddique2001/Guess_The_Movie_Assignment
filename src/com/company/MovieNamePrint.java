package com.company;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class MovieNamePrint {
    public static String Moviename() {
        String[] str = new String[10000];
        int n = 0, i;
        try {
            File Txt = new File("MovieNames.txt");
            Scanner keyBoardInput = new Scanner(Txt);
            i = 0;
            while (keyBoardInput.hasNextLine()) {
                str[i] = keyBoardInput.nextLine();
                i++;
            }
            Random randomInput = new Random();
            n = randomInput.nextInt(i);
        } catch (Exception e) {
            System.out.println("not Found");
        }
        return str[n];
    }
}
