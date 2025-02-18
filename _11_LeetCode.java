/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water. */


import java.util.Scanner;

public class _11_LeetCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] height = new int[n];

        System.out.println("Enter the heights:");
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        // Calling maxArea function
        Solution solution = new Solution();
        int maxWater = solution.maxArea(height);

        // Printing the result
        System.out.println("Maximum water that can be stored: " + maxWater);

        scanner.close();
    }
}

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0;
        int x, y, z;
        int j = n - 1;
        int max = 0;
        while (i != j) {
            if (height[i] < height[j]) {
                x = j - i;
                y = height[i];
                z = x * y;
                i++;
            } else {
                x = j - i;
                y = height[j];
                z = x * y;
                j--;
            }
            if (max < z) {
                max = z;
            }
        }
        return max;
    }
}
/*
 OutPut:
Enter the number of elements: 9
Enter the heights:
 1 2 8 5 0 4 6 3 7 
Maximum water that can be stored: 42
 */




/*class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int x,y,z;
        int j=n-1;
        int max=0;
        while(i!=j){
            if(height[i]<height[j]){
                x= j-i;
                y=height[i];
                z=x*y;
                i++;

            }
            else{
                x= j-i;
                y=height[j];
                z=x*y;
                j--;
                
            }
            if(max<z){
                max=z;
            }

        }
           return max;
    }
 
} */