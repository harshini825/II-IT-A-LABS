import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class Palindstr_queue {

    public static void main(String[] args) {

        Scanner instr=new Scanner(System.in);
        String inputString = instr.nextLine();
        Queue queue = new LinkedList();

        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }

        String reverseString = "";

        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("Given String is a palindrome.");
        else
            System.out.println("Given String is not a palindrome.");

    }
}