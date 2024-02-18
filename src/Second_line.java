// For this problem, you need to write code to read two lines of input and print the second line of input.
// Sample Input 1
// Fundamentals Python
// Sample Output 1
// 1
// 1
// Python
// Sample Input 2
// Tom
// Jerry
// Sample Output 2
// Jerry

import java.util.*;
class Second_line {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        String firstline = scanner.nextLine();
        String secondLine = scanner.nextLine();
        
        System.out.print(secondLine);
    }
}