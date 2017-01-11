import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] array = new long[5];
        array[0] = in.nextLong();
        array[1] = in.nextLong();
        array[2] = in.nextLong();
        array[3] = in.nextLong();
        array[4] = in.nextLong();
        Arrays.sort(array);
        long max = array[1]+array[2]+array[3]+array[4];
        long min = array[1]+array[2]+array[3]+array[0];
        System.out.print(min + " " + max);



    }
}
