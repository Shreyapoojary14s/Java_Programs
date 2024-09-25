/* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example 1:
Input: l1 = [0], l2 = [0]
Output: [0]

Example 2:
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/

import java.util.Scanner;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { 
        this.val = val; 
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            sum = sum % 10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if (carry > 0) {
            ptr.next = new ListNode(carry);
        }
        return result.next;
    }
}

public class _2_LeetCode {
    //print linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    //linked list from user input
    public static ListNode createList(int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " digits in reverse order:");
        ListNode head = null;
        ListNode tail = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first linked list
        System.out.println("Enter the number of digits for the first number:");
        int n1 = scanner.nextInt();
        ListNode l1 = createList(n1);

        // Input for second linked list
        System.out.println("Enter the number of digits for the second number:");
        int n2 = scanner.nextInt();
        ListNode l2 = createList(n2);

        // func call
        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print the result
        System.out.println("The sum of the two numbers is:");
        printList(result);
        scanner.close();
    }
}
/*
 OutPut:
Enter the number of digits for the first number:
5
Enter 5 digits in reverse order:
9 9 9 9 9
Enter the number of digits for the second number:
3
Enter 3 digits in reverse order:
8 8 8
The sum of the two numbers is:
7 -> 8 -> 8 -> 0 -> 0 -> 1
 */



 /*
  leetcode main function:
  /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       
        ListNode result=new ListNode(0);
        ListNode ptr=result;
        int carry=0;
        while (l1!=null || l2!=null) {
            int sum=0+carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
        }
        if(carry==1)ptr.next=new ListNode(1);
        return result.next;
    }
    
}
  */
