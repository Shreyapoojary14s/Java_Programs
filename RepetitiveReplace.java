import java.util.Scanner;

public class RepetitiveReplace {
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
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    arr[j]='@'; //if repetitive char << replace by '@'
                }
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
 *  <<Time complexity O(n2)>>
    Enter the length of array :5
    Enter the character :a d a s f
    Before replace:
    a d a s f 
    After replace:
    a d @ s f 
    
    Enter the length of array :3
    Enter the character :s s s
    Before replace:
    s s s 
    After replace:
    s @ @
 */
