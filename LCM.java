import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        
        int result = lcm(first, second);
        System.out.println("LCM of " + first + " and " + second + " is: " + result);
        
        scanner.close();
    }

    public static int lcm(int first, int second) {
        return (first * second) / gcd(first, second); //call gcd
    }

    public static int gcd(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
/*
 Enter the first number: 4
 Enter the second number: 5
 LCM of 4 and 5 is: 20
 */
