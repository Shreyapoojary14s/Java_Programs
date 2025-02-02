import java.util.Scanner;

public class _6_LeetCode {
    public static String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int index = 0, step = 1;
        for (char c : s.toCharArray()) {
            rows[index].append(c);
            if (index == 0) {
                step = 1;
            } else if (index == numRows - 1) {
                step = -1;
            }
            index += step;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the string: ");
        String s = scanner.nextLine();
        
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        
        // Display the result
        System.out.println("Zigzag Conversion Output: " + convert(s, numRows));

        scanner.close();
    }
}
