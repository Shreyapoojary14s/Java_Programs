import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a character to check its vowel or consonant :");
        char check=scanner.next().charAt(0);
        vowelConsonant(check);
        scanner.close();
    
}
public static void vowelConsonant(char check){
    char lowercase=Character.toLowerCase(check);//convert upperCase to lowerCase
    if(lowercase=='a'||lowercase=='e'||lowercase=='i'||lowercase=='o'||lowercase=='u'){
        System.out.println("'"+check+"' is vowel");
    }
    else{
        System.out.println("'"+check+"' is consonant");
    }
}   
}
/*
  Enter a character to check its vowel or consonant :A
  'A' is vowel
 */
