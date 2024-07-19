import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of fibonacci series:");
        int count=scanner.nextInt();
        System.out.print("Fibonacci Series are :");
        fibonacci(count);
    }
    public static void fibonacci(int count){
        int a=0,b=1;
        int c=0;
        for(int i=1;i<=count;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    
    }
    
}
