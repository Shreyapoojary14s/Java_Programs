import java.util.Scanner;
public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the Integer :");
        String number=scanner.nextLine();
        int num=numOfDigit(number);
        System.out.println("Number of digits in "+number+" is:"+num);
        scanner.close();
    }
    public static int numOfDigit(String number){
        int count=number.length();//use of built in fun>>length();
        return count; 
    } 
}
/*
Enter the Integer :8545
Number of digits in 8545 is:4
Enter the Integer :123456789
Number of digits in 123456789 is:9
 */
