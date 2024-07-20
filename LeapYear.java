import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year=scanner.nextInt();
        leapyear(year);
        scanner.close();
    }
    public static void leapyear(int year){
        //divisible by 4 unless divisible by 100 or divisible by 400= leap yr
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
           System.out.println(year+" is a leap year"); 
        }
        else{
                System.out.println(year+" is not a leap year");
         }
    } 
}
/*
 Enter the year : 2000
 2000 is a leap year
 Enter the year : 2025
 2025 is not a leap year
 */