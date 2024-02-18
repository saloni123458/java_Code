// For this problem, you need to write code to read a single line of input and print the line after the message "Given input: ".
// Sample Input 1
// Happy Coding
// Sample Output 1
// Given input: Happy Coding
// Sample Input 2
// Tech Foundations
// Sample Output 2
// Given input: Tech Foundations

import java.util.*;
class print_input_2 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        String userinsput = scanner.nextLine();
        
        System.out.print("Given input: " + userinsput);
    }
}