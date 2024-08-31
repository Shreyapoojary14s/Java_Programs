/*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any ord
 */

 //time complexity=O(n2)
// import java.util.Scanner;
// public class _1_LeetCode {
//     public static void main(String[] args) {
//         Scanner scanner =new Scanner(System.in);
//         System.out.println("Enter the length of array:");
//         int n=scanner.nextInt();
//         int[] num=new int[n];
//         System.out.println("Enter the Numbers :");
//         for(int i=0;i<n;i++){
//             num[i]=scanner.nextInt();
//         }
//         System.out.print("Enter the target sum :");
//         int target=scanner.nextInt();
//         twoSum(num, target);
//         scanner.close();
//     }
//     public static void twoSum (int[] num,int target){
//         int n = num.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++){
//                 if(num[i]+num[j]==target){
//                     System.out.println("["+i+","+j+"]");
//                     return;
//             }
//         }}
//     }
// }

//use of hash map= O(n)
import java.util.HashMap;
import java.util.Scanner;

public class _1_LeetCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = scanner.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the Numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.print("Enter the target sum:");
        int target = scanner.nextInt();
        int[] result = twoSum(num, target);
        if (result != null) {
            System.out.println("[" + result[0] + "," + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
        scanner.close();
    }

    public static int[] twoSum(int[] num, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complement = target - num[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(num[i], i);
        }
        return null; // Return null if no solution is found
    }
}
/*
Enter the length of array:
3
Enter the Numbers:
1
2
5
Enter the target sum:3
[0,1]
 */
