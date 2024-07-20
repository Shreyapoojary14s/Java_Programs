import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number :");
        int firstNum=scanner.nextInt();
        System.out.println("Enter second number :");
        int secondNum=scanner.nextInt();
        scanner.close();
        int gcd=printgcd(firstNum, secondNum);
        System.out.printf("GCD of %d & %d is :%d",firstNum,secondNum,gcd);
    }
    public static int printgcd(int firstNum,int secondNum){
        //Using the Euclidean Algorithm
        while(secondNum!=0){
            int temp=secondNum;
            secondNum=firstNum%secondNum;
            firstNum=temp;
        }
        return firstNum; //when secondNum=0 >> firstNum=highest divisor
    }
    
}
/*
    Enter first number :
    10
    Enter second number :
    15
    GCD of 10 & 15 is :5
*/
