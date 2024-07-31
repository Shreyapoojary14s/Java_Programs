import java.util.HashSet;
import java.util.Scanner;

public class RepetitiveReplaceHashSet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int len=scanner.nextInt();
        checkRepetitive(len, scanner);//func call
        scanner.close();
    }

    public static void checkRepetitive(int len,Scanner scanner){
        char[] arr=new char[len]; //array declaration
        System.out.print("Enter the character :");
        for(int i=0;i<len;i++){
            arr[i]=scanner.next().charAt(0);
        }
        //print before replace
        System.out.println("Before replace:");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("");
        //use of hash set<< time complexity<< O(n)
        HashSet<Character> seenChars=new HashSet<>();
        for(int i=0;i<len;i++){
            if(seenChars.contains(arr[i])){
                arr[i]='@'; //if repetitive char << replace by '@'
            }
            else{
                seenChars.add(arr[i]);
            }
        }

        //print after replace
        System.out.println("After replace:");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
    Enter the length of array :5
    Enter the character :a s a d a e
    Before replace:
    a s a d a 
    After replace:
    a s @ d @ 
 */