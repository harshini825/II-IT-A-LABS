class Final
{
public static void main(String args[])
{
try
{
int a= 1/0;
}
catch(ArithmeticException c)
{
System.out.println(c.getMessage());
}
finally
{
System.out.println("Final Block");
}
}
}