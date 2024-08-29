/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any ord
 */

import java.util.Scanner;

public class _1_LeetCode {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=scanner.nextInt();
        int[] num=new int[n];
        System.out.println("Enter the Numbers :");
        for(int i=0;i<n;i++){
            num[i]=scanner.nextInt();
        }
        System.out.print("Enter the target sum :");
        int target=scanner.nextInt();
        twoSum(num, target);
        scanner.close();
    }
    public static void twoSum (int[] num,int target){
        int n = num.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++){
                if(num[i]+num[j]==target){
                    System.out.println("["+i+","+j+"]");
                    return;
            }
        }}
    }
}
