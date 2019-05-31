package algorithms.warmup.easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
 */
public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        long[] result = new long[]{ Long.MAX_VALUE , Long.MIN_VALUE }; // 0 - Min 1 - Max
        int size = arr.length;

        // uma vez pra cada item
        for( int i=0; i<size; i++){

            long r = 0;
            for( int x=0; x<size; x++){
                if(x != i){
                    r += arr[x];
                }
            }

            if( r < result[0] ) result[0] = r;
            if( r > result[1] ) result[1] = r;
        }

        System.out.println(result[0] + " " + result[1]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        */

        int[] arr = new int[]{1,2,3,4,5};

        miniMaxSum(arr);

        scanner.close();
    }

}
