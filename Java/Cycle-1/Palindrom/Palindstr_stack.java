import java.util.Stack;
import java.util.Scanner;
class Palindstr_stack {

    public static void main(String[] args) 
    {
        Scanner instr=new Scanner(System.in);
        String inputString = instr.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("given String is a palindrome");
        else
            System.out.println("given String is not a palindrome");

    }
}