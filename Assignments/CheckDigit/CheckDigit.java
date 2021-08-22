/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit {

    public static void main (String[] args) {
        int sum1=0;
        int sum2=0;
        long barcode = Long.parseLong(args[0]);
        int count = 1;
        while(barcode>0) {
            if(count%2!=0)
                sum1 += barcode%10;
            else
                sum2 += barcode%10;
                barcode /= 10;
                count++;
        }
        sum1 %= 10;
        sum2 %= 10;
        sum2 *= 3;
        sum2 %= 10;
        int result = sum1+sum2;
        result %= 10;
        System.out.println(result);
    }
}
