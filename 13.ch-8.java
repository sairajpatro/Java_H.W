// Write a program to find and display the sum of all natural numbers from 1 to n.
import java.util.*;
class Natural
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,n,s=0;
        System.out.println("Enter the value of n");
        n= sc.nextInt();
        for(a=1;a<=n;a++)
        s=s+a;
        System.out.println("The sum of the natural numbers up to"+n+"="+s);
    }
}
