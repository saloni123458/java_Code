// Write a program that reads two lines of input and prints those two lines in the reverse order. (Print the message given in the second line of input before the first line of input)
// Sample Input 1
// Book
// Pen
// Sample Output 1
// Pen
// Book
// Sample Input 2
// 4
// 5
// Sample Output 2
// 5
// 4

import java.util.*;
class Reverse_order {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        
        System.out.println(secondLine);
        System.out.println(firstLine);
    }
}