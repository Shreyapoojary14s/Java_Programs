import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=scanner.nextInt();
        System.out.println("Enter the power :");
        int power=scanner.nextInt();
        powerOfNumber(num, power);
        scanner.close();
    }
    public static void powerOfNumber(int number,int power){
        int result=number;
        for(int i=2;i<=power;i++){
            result=number*result;
        }
        System.out.println("result :"+result);
    }
    
}
/*
 Enter the number :
 27
 Enter the power :
 5
 result :14348907
 */
