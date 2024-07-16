import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result=factorial(n);
        System.out.println("Factorial of " + n + " is = " + result);
        scanner.close();
    }

    public static int factorial(int n) {
       if(n==0 || n==1){
        return 1;
       }
       else{
        return n*factorial(n-1);
       }
    }
}