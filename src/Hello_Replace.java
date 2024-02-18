// Write a program that takes a word W followed by the given word W. as input and prints "Hello"
// Sample Input
// World
// Sample Output
// Hello World
import java.util.*;
class Hello_Replace {
    public static void main(String[] args) { 
        String str1 = "Hello ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Charater:");
        String userinput = scanner.nextLine();
        System.out.println(str1.concat(userinput));
        scanner.close();
    }
}