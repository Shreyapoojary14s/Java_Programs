import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num=scanner.nextInt();
        printMultiplication(num);
        scanner.close();
    }
    public static void printMultiplication(int num){
        System.out.println("Multiplication table of "+num+" is:");
        for(int i=1;i<=10;i++){
            //System.out.printf("%d*%d=%d%n",num,i,i*num);
            System.out.println(num+"*"+i+"="+(i*num));
        }
    }
}
/*
Enter the Number :5
Multiplication table of 5 is:
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
 */
