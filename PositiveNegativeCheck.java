import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number to check :");
        float check=scanner.nextFloat();
        postiveNegative(check);
        scanner.close();
    }
    public static void postiveNegative(float check){
        if (check > 0) {
            System.out.println(check + " is a positive number");
        } else if (check < 0) {
            System.out.println(check + " is a negative number");
        } else {
            System.out.println(check + " is zero");
        }
    }
}
/*
 * Enter the number to check :-968
   -968.0 is a negative number
   Enter the number to check :969
   969.0 is a positive number
   Enter the number to check :0
`  0.0 is zero
 */
