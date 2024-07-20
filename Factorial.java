import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result=factorial(n);
        System.out.println("Factorial of " + n + " is = " + result);
        scanner.close();
    }

    public static int factorial(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
        
    }
}
