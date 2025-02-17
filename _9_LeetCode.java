/*Given an integer x, return true if x is a palindrome, and false otherwise.
Example 1:
Input: x =  121
Output: true */

import java.util.Scanner;

public class _9_LeetCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input:");
        int x = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leak

        Solution solution = new Solution(); // Create an instance of Solution
        System.out.println("Is " + x + " a palindrome? " + solution.isPalindrome(x));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }
}


/*
 class Solution {
    public boolean isPalindrome(int x) {
         int y = 0;
         int z=x;
         while (x != 0) {
             y = y * 10 + (x % 10);
             x = x / 10;
         }
         if (z == y && z >= 0) return true;
         else return false;
    }
}

 */

