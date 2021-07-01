import java.util.Scanner;
public class Calculator
{
   public static void main(String[] args)
   {
      char operator;
      float result;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the values of a and b: ");
      float a = sc.nextFloat();
      float b = sc.nextFloat();
      System.out.print("choose an opertor: ");
      operator = sc.next().charAt(0);
      switch(operator){
       case '+':
          result = a+b;
          System.out.print("Sum of a and b is :" + result);
          break;
       case '-':
          result = a-b;
          System.out.print("Difference of a and b is :" + result);
          break;
       case '*':
          result = a*b;
          System.out.print("Multiplication of a and b is :" + result);
          break;
       case '/':
          result = a/b;
          System.out.print("Division of a and b is :" + result);
          break;
        default:
        System.out.println("Invalid operator!");
        break;
      }
   }
}