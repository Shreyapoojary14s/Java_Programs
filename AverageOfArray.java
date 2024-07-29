import java.util.Scanner;

public class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        averageOfArray(scanner); //calling function
        scanner.close();
    }
    public static void averageOfArray(Scanner scanner){
        System.out.print("Enter the length of array :");
        int n=scanner.nextInt();
        int[] numbers =new int[n]; //use of array
        System.out.println("Enter the integers :");
        int result=0;
        for(int i=0;i<n;i++){
            numbers[i]=scanner.nextInt();
            result+=numbers[i];
        }
        double average=(double)result/n; //result<<casting
        System.out.println("Average of array is :"+ average);

    }
    
}
