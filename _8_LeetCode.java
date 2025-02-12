/*Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer. */
import java.util.Scanner;

public class _8_LeetCode {
    public static void main(String[] args) {
        String s;
        int i = 0, num = 0, sign = 1;
        System.out.print("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = s.trim(); 

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

     
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            num = num * 10 + digit;
            i++;
        }

        System.out.println(num * sign);
    }
}
/*
 * Output
 Enter the input: 0000Itsme
0
Enter the input: -poj
0
Enter the input:  -095236
-95236
 */