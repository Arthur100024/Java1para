package com.company;
import java.util.ArrayList;

public class Main {

    public static String work(double word1[], double word2[]) {

        ArrayList<Double> word1Array = new ArrayList<Double>();
        ArrayList<Double> word2Array = new ArrayList<Double>();

        for (int i = 0; i < 5; i++) {
            word1Array.add(word1[i]);
            word2Array.add(word2[i]);
        }

        int n = 0;
        while (!word1Array.isEmpty() && !word2Array.isEmpty()) {
            double x = word1Array.get(0);
            double y = word2Array.get(0);
            word1Array.remove(0);
            word2Array.remove(0);
            if (n > 1000000) return "botva";
            else {
                if (x == 0 && y == 9) {
                    word1Array.add(x);
                    word1Array.add(y);
                } else if (x == 9 && y == 0) {
                    word2Array.add(x);
                    word2Array.add(y);
                } else {
                    if (x > y) {
                        word1Array.add(x);
                        word1Array.add(y);
                    }
                    if (x < y) {
                        word2Array.add(y);
                        word2Array.add(x);
                    }
                    if (x == y) {
                        word1Array.add(x);
                        word2Array.add(y);
                    }
                }
                n++;
            }
        }
        if (word1Array.isEmpty())
            return "second";
        else
            return "first";
    }

    public static void main (String[]args){

        double word1[] = {1.0, 3.0, 5.0, 7.0, 9.0};
        double word2[] = {2.0, 4.0, 6.0, 8.0, 0.0};
        System.out.println(work(word1, word2));
    }
}
