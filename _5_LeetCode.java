//Given a string s, return the longest palindromic substring in s.


// public class _5_LeetCode {
//     public static void main(String[] args) {
//         String s="babad";
//         int n=s.length();
//         for(int i=0;i<n;i++){
//             for(int j=n-1;j>=0;){
//                 if(s.charAt(i)==s.charAt(j)){
//                     i++;
//                     j++;

//                 }
//                 else j++;
//             }
//         }
//     }
// }

//brute foce O(n3)
import java.util.Scanner;

public class _5_LeetCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine(); 
        scanner.close();

        System.out.println("Longest Palindromic Substring: " + findLongestPalindrome(s));
    }

    static String findLongestPalindrome(String s) {
        int n = s.length();
        String longest = ""; 

        // Generate all substrings
        for (int i = 0; i < n; i++) {  
            for (int j = i; j < n; j++) { 
                String sub = s.substring(i, j + 1); // Extract substring
                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub; // Update longest palindrome
                }
            }
        }
        return longest;
    }

    static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {     //  mismatch, not a palindrome
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


//output
// Enter a string: ljikik
// Longest Palindromic Substring: iki