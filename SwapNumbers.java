import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        swapNum(a, b);
        scanner.close();//resource management
    }
    public static void swapNum(int a, int b){
        System.out.println("Before swaping :"+a+" & "+b);
        //use of two variables
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping :"+a+" & "+b);
    } 
    
}
/*
Enter two numbers :
56
79
Before swaping :56 & 79
After swaping :79 & 56
 */
