import java.util.Scanner;
class Palindstr{
   public static void main(String args[])
   {
      String reverseString="";
      Scanner scanner = new Scanner(System.in);
      String inputString = scanner.nextLine();

      int length = inputString.length();

      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverseString = reverseString + inputString.charAt(i);

      if (inputString.equals(reverseString))
         System.out.println("Given string is a palindrome.");
      else
         System.out.println("Given string is not a palindrome.");

   }
}