package com.company;
import java.util.LinkedList;

public class Main {

    public static String work(int word1[], int word2[]) {

        LinkedList<Integer> word1Array = new LinkedList<Integer>();
        LinkedList<Integer> word2Array = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            word1Array.addLast(word1[i]);
            word2Array.addLast(word2[i]);
        }

        int n = 0;
        while (!word1Array.isEmpty() && !word2Array.isEmpty()) {
            int x = word1Array.getFirst();
            int y = word2Array.getFirst();
            word1Array.removeFirst();
            word2Array.removeFirst();
            if (n > 1000000) return "botva";
            else {
                if (x == 0 && y == 9) {
                    word1Array.addLast(x);
                    word1Array.addLast(y);
                } else if (x == 9 && y == 0) {
                    word2Array.addLast(x);
                    word2Array.addLast(y);
                } else {
                    if (x > y) {
                        word1Array.addLast(x);
                        word1Array.addLast(y);
                    }
                    if (x < y) {
                        word2Array.addLast(y);
                        word2Array.addLast(x);
                    }
                    if (x == y) {
                        word1Array.addLast(x);
                        word2Array.addLast(y);
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

        int word1[] = {1, 3, 5, 7, 9};
        int word2[] = {2, 4, 6, 8, 0};
        System.out.println(work(word1, word2));
    }
}
