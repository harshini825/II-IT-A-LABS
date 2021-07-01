public class Compoundinterest
{
public static void main(String[] args)
{
int p = 2000;
double r=0.08;
int n =12;
int t = 5;
double compint = p*(1 + r/n)*(n*t)-p;
System.out.println("Compound interest = "+compint);
}
}