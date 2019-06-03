package algorithms.warmup.easy;

import org.junit.Test;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

import static org.junit.Assert.assertEquals;


public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if( s.contains("PM") && Integer.parseInt(s.substring(0,2)) != 12  ){
            s = ((Integer) (Integer.parseInt(s.substring(0,2)) + 12)).toString() + s.substring(2,8);
        }else if( s.contains("AM") && Integer.parseInt(s.substring(0,2)) == 12  ){
            s = "00" + s.substring(2,8);
        }
        return s.substring(0,8);
    }

    private static final Scanner scan = new Scanner(System.in);

    @Test
    public void test(){
        assertEquals( "19:05:45" , timeConversion("07:05:45PM") );
        assertEquals( "07:05:45" , timeConversion("07:05:45AM") );
        assertEquals( "22:59:59" , timeConversion("10:59:59PM") );
        assertEquals( "10:59:59" , timeConversion("10:59:59AM") );
        assertEquals( "00:21:00" , timeConversion("00:21:00AM") );
        assertEquals( "12:05:45" , timeConversion("12:05:45PM") );
        assertEquals( "00:05:45" , timeConversion("12:05:45AM") );
    }

    public static void main(String[] args) throws IOException {

        String s = "07:05:45PM";

        /*
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();
        */
        String result = timeConversion(s);
        /*
        bw.write(result);
        bw.newLine();

        bw.close();
        */

    }
}
