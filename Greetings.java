import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the current time :");
        String time=scanner.nextLine();
        greetings(time);
        scanner.close();
    }
    public static void greetings(String time) {
        String[] timePart=time.split("\\.");// use of regular expression
       int  hours=Integer.parseInt(timePart[0]);//parsing string>>int
       int  minute=Integer.parseInt(timePart[1]);//parsing string>>int

        if (hours < 0 || hours >= 24|| minute<0||minute>60) {
            System.out.println("Enter a valid time between 0 and 24");
        } else if (hours < 12) {
            System.out.println("Good Morning");
        } else if (hours < 16) {
            System.out.println("Good Afternoon");
        } else if (hours < 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
    
}
/*
Enter the current time :
26.40
Enter a valid time between 0 and 24
Enter the current time :
09.30
Good Morning
 */
