import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
    System.out.print("Enter number to check its odd or even :");
    Scanner scanner=new Scanner(System.in);
    int check=scanner.nextInt();
    oddEven(check);
    scanner.close();
}
public static void  oddEven(int check){
if(check%2==0){
    System.out.println(check+" is even number");
}
else{
    System.out.println(check+" is odd number");
}
}
    
}
