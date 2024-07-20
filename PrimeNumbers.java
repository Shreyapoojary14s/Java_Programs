import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the nth number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Prime numbers up to " + n + ":");
        System.out.println(2); // 2 is the first prime number

        for (int i = 3; i <= n; i += 2) { // Check only odd numbers
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
