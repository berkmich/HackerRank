import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    private static int arrayElemDiff(int[] a, int n) {
        int tempLow = 0;
        int tempHigh = 0;
        int tempDiff = 0;
        int l = 0 , m = 0;
        if (n == 0) {
            tempDiff = a[0];
        } else {
            for (int i = 1; i < n; i++) {
                l = Math.max(Math.abs(1 - a[i - 1]) + tempHigh, tempLow);
                m = Math.max(Math.abs(a[i] - 1) + tempLow, Math.abs(a[i] - a[i - 1] )+ tempHigh);
                tempLow = l;
                tempHigh = m;
            }
        }

        //  System.out.println(tempDiff);
        return tempDiff = Math.max(tempLow, tempHigh);
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //numbers of cases
        //integers that denote the array B
        //int cost = 0; //total cost
        for (int j = 0; j < t; j++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
                // System.out.println(cost);
            }
            System.out.println(arrayElemDiff(a, n));
        }

    }
}

