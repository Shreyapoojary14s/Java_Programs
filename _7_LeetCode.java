/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0. */

/*import java.util.Scanner;

public class _7_LeetCode {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the input");
        int a=sc.nextInt();
        int b=0;
        while (a!=0){
            if(a<0){
                System.out.print("-");
                a=Math.abs(a);
            }
            b=a%10;
            if(b!=0){
                System.out.print(b);
            }
            a=a/10;
        }
        
       sc.close();
    }
}
*/

//Optimized code
import java.util.Scanner;

public class _7_LeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int a = sc.nextInt();
        sc.close();

        int reversed = 0;
        boolean isNegative = a < 0;
        a = Math.abs(a); // Convert to positive once

        while (a != 0) {
            reversed = reversed * 10 + (a % 10); // Construct reversed number
            a /= 10;
        }

        System.out.println(isNegative ? "-" + reversed : reversed);
    }
}
/*
 * output
 Enter the input
 -89625410
 -1452698
 Enter the input:
 -65
 -56
 */