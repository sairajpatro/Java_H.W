// Write a program to find and display the sum of the given series
// s=1/2 + 1/4 + 1/8 + 1/16 + -----------------upto n terms
import java.util.*;
class Series
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a,n;
        double s = 0;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(a=1;a<=n;a++)
        s=s+1.0/Math.pow(2,a);
        System.out.println("The sum of the series is "+s);
    }
}
