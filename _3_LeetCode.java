/* 3. Given a string s, find the length of the longest substring without repeating characters.*/

// Here i have used sliding window , left and right two pointers
import java.util.HashSet;
import java.util.Scanner;

public class _3_LeetCode {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        System.out.println("Length of the longest substring without repeating characters: " + lengthOfLongestSubstring(s));
        scanner.close();
}
}
// Enter the string: klikopiklougtf
// Length of the longest substring without repeating characters: 9
// Enter the string: awera
// Length of the longest substring without repeating characters: 4
