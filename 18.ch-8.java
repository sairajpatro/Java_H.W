// Write a program to find and display the sum of the given series.
// s =1 + (1*2) + (1*2*3) + ----------------------- + (1*2*3*4*5.............*n)
import java.util.*;
class series6
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a,n,p=1,s=0;
        System.out.println("Enter the value of n ");
        n = sc.nextInt();
        for (a=1;a<=n;a++)
        {
            p = p*a;
            s = s+p;
        }
        System.out.println("The sum of the series is "+s);
    }
}
