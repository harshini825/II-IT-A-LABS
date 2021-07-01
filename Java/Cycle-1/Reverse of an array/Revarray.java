import java.util.Scanner;
public class Revarray
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("No of elements in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.println("Elements in reverse order:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(a[i]);
        }
    }
}