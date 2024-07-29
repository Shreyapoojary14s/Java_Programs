import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number to check Armstrong :");
        String num=scanner.nextLine();
        checkArmstrong(num);//calling function
        scanner.close();
    }
    public static void checkArmstrong(String num){
        int n=num.length();
        int result=0;
        for(int i=0;i<n;i++){
            int check=Character.getNumericValue(num.charAt(i));
            result+=Math.pow(check,n );
        }
        int numInt = Integer.parseInt(num);//casting
        if(result==numInt){
            System.out.println(num+" is Armstrong number");
        }
        else{
            System.out.println(num+" is not Armstrong number");
        }
    }
    
}
/*
 Enter the number to check Armstrong :154
 154 is not Armstrong number
 Enter the number to check Armstrong :50
 50 is not Armstrong number
 */
