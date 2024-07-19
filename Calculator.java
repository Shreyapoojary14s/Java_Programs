import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choice your required operation:");
        System.out.println("1.Addition\n2.Subtract\n3.Multiply\n4.Division");
        int operation=scanner.nextInt();
        calci(operation,scanner);
        scanner.close();
        }
       
    
    public static void calci(int operation, Scanner scanner){
        System.out.println("Enter the two numbers a & b");
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        switch (operation) {
            case 1:{
                System.out.println("Sum of "+a+" & "+b+" is :"+(a+b)); 
                break;

        }
        case 2:{
            System.out.println("Subtraction of "+a+" & "+b+" is :"+(a-b)); 
            break;
        }
        case 3:{
            System.out.println("Multiplication of "+a+" & "+b+" is :"+(a*b)); 
            break;
        }
        case 4:{
            if(b!=0){
            System.out.println("Quotient of "+a+" & "+b+" is :"+(a/b));
            }
            else{
                System.out.println("Division by zero is not allowed");
            }
            break;
          
        }
        default:System.out.println("Enter valid choice");

    }
    
}
}
