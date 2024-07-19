import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char a=scanner.next().charAt(0);
        ascii(a); //call function
        scanner.close();
    }
    public static void ascii(char a){
        int asciiValue = (int) a; //casting char into int
        System.out.println("ASCII value of '"+a+"' is :"+asciiValue);
    }
}
/*
 output:
Enter a character : 
S
ASCII value of 'S' is :83
 */
