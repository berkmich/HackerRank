import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        double p , n ,z;
/* I use Array List because i need the length of the array variable
and not constant */

        ArrayList<Integer> array_positive = new ArrayList<Integer>();
        ArrayList<Integer> array_negative = new ArrayList<Integer>();
        ArrayList<Integer> array_zeros = new ArrayList<Integer>();

        for(int i = 0; i < t; i++){
            int temp = in.nextInt();
            if (temp > 0){
                array_positive.add(temp);

            }
            else if (temp<0){
                array_negative.add(temp);
            }
            else
                array_zeros.add(temp);

        }
        p = (double) array_positive.size() / (double) t;
        n = (double) array_negative.size() / (double) t;
        z = (double) array_zeros.size()    / (double) t;
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);



/*       System.out.println(array_positive.size());
       System.out.println(array_negative.size());
       System.out.println(array_zeros.size());*/

    }
}