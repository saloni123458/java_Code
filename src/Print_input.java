// Write a program that reads a single line of input and print the given input.
// Sample Input 1
// Bat
// Sample Output 1
// Bat
// Sample Input 2
// 5
// Sample Output 2
// 5
import java.util.*;
class Print_input {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String userinput = scanner.nextLine();
        
        System.out.print(userinput);
    }
}