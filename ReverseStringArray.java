import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        System.out.println("Enter the string you want to reverse :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        String reversedString = reverse(name);
        System.out.println(reversedString);
        
        scanner.close();
    }

    public static String reverse(String name) {
        char[] charArray = new char[name.length()];  //array length= name

        for (int i = 0; i < name.length(); i++) {
            charArray[i] = name.charAt(name.length() - 1 - i);
        }
        
        return new String(charArray);  //  character  to string
    }
}
