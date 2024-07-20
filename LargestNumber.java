import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of number:");
        int count=scanner.nextInt();
        System.out.println("Enter the numbers");
        int a[]=new int[count] ;  
        for(int i=0;i<=count-1;i++){
           a[i]=scanner.nextInt();
        }
        largest(a, count);
        scanner.close();
    }
    public static void largest(int[] a,int count) {
        int larg= a[0];
        for(int i=1;i<count;i++){
            if(larg<a[i]){
                larg=a[i];
            }
        }
        System.out.println("Largest among the provided numbers is :"+larg);
    }
    
}
/*
 Enter the length of number:5
 Enter the numbers
 4
 9
 2
 12
 3
 Largest among the provided numbers is :12
*/
