public class exp1{
public static void main(String args[])
{
try
{
int a= 2/0;
}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
}
}