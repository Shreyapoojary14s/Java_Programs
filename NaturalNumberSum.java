import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of natural numbers :");
        int count=scanner.nextInt();
        int result=sumOfNum(count);
        System.out.println("sum of "+count+" natural numbers is :"+result);

    }
    public static int sumOfNum(int count){
        //<<here time complexity is O(n)>>
        // int sum=0;
        // for(int i=0;i<=count;i++){
        //     sum=sum+i;
        // }
        // return sum;   
        return count*(count+1)/2; //time complexity is O(1)>> efficient way
    }
}
/* 
  Enter the number of natural numbers :5
  sum of 5 natural numbers is :15
  Enter the number of natural numbers :0
  sum of 0 natural numbers is :0
*/
