import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length :");
        int len=scanner.nextInt();
        calculateSD(len, scanner);//func call
        scanner.close();
    }

    public static void calculateSD(int len,Scanner scanner){
        System.out.print("Enter the numbers :");
        int[] number=new int[len];
        //calculate mean
        int meanIntermediate=0;
        for(int i=0;i<len;i++){
            number[i]=scanner.nextInt();
            meanIntermediate+=number[i];
        }
        double mean=meanIntermediate/len;
        System.out.println("Mean :"+mean);
        
        //calculate variance
        double varianceIntermediate=0;
        for(int i=0;i<len;i++){
            double med=(number[i]-mean);
            varianceIntermediate+=Math.pow(med,2);
        }
        
        double variance=varianceIntermediate/len;
        System.out.println("Variance :"+variance);
        System.out.printf("Standard deviation :%.2f%n",(Math.sqrt(variance)));
    }
    
}
/*
Enter the length :8
Enter the numbers :10 12 23 23 16 23 21 16 
Mean :18.0
Variance :24.0
Standard deviation :4.90
 */