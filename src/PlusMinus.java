import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Nesse problema tem que separar positivos, negativos e zeros, exibir nessa sequencia a
 * quantidade deles na array e fazer com que seja exibido o número decimal em 6 casas
 */
public class PlusMinus {

    static void plusMinus(int[] arr) {

        int arrayLenth = arr.length;
        int[] p = new int[3];

        DecimalFormat decimalFormat = new DecimalFormat("0.000000");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);

        for( int i = 0; i < arrayLenth; i++ ){
            if( arr[i] > 0 ){
                p[0]+=1;
            } else if ( arr[i] == 0 ){
                p[1]+=1;
            } else{
                p[2]+=1;
            }
        }

        System.out.println( decimalFormat.format((double) p[0] / arrayLenth) );
        System.out.println( decimalFormat.format((double) p[2] / arrayLenth) );
        System.out.println( decimalFormat.format((double) p[1] / arrayLenth) );
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
        */
        plusMinus(new int[]{-4,3,-9,0,4,1});
    }

}
