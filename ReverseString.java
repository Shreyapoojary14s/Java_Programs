
import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
       // String name="SHREYA";
  String name;
  System.out.println("Enter the String you want to reverse");
  Scanner scanner=new Scanner(System.in);
  name=scanner.nextLine();
//    for(int i=name.length()-1;i>=0;i--){
//              System.out.print (name.charAt(i));
//         }
//use of methods
String reversedString=reverse(name);
System.out.println(reversedString);
       scanner.close();
     }
     public static String reverse(String name){
        StringBuilder reversedString=new StringBuilder();// StringBuilder>>mutable
           for(int i=name.length()-1;i>=0;i--){
      reversedString.append(name.charAt(i));
        }
        return reversedString.toString();

     }

}