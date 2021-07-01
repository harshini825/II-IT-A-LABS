import java.util.Scanner;
class Palindstr_while {
   public static void main(String args[])
   {
      String reverseString="";
      Scanner scanner = new Scanner(System.in);
      String inputString = scanner.nextLine();

      int length = inputString.length();
      int i = length-1;
      while ( i >= 0){
         reverseString = reverseString + inputString.charAt(i);
         i--;
      }
      if (inputString.equals(reverseString))
         System.out.println("Given string is a palindrome.");
      else
         System.out.println("Given string is not a palindrome.");

   }
}