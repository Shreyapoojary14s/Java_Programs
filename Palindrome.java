import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a string to check palindrome:");
        String check=scanner.nextLine();
        if(checkPalindrome(check)){
            System.out.println(check+" is palindrome");
        }
        else{
            System.out.println(check+" is not a palindrome");
        }
        scanner.close();
    }
    public static boolean checkPalindrome(String check){
        //without array
        int left=0;
        int right=check.length()-1;
        while(left<right){
            if(check.charAt(left)!=check.charAt(right)){
                return false;  
            }
            left++;
            right--;
        }
        return true;
    }
    
}
/*
 Enter a string to check palindrome:shreya
 shreya is not a palindrome
 Enter a string to check palindrome:ababbajabbaba
 ababbajabbaba is palindrome
 */
