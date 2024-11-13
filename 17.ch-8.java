// Write a program to find and display the sum of the given series.
// s= a- a/2 +a/3 - a/4 + --------------------  -a/20
import java.util.*;
class series5
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,a;
        double s=0;
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        for(i=1;i<=20;i++)
        {
            if(i%2==0)
            s = s-(double)a/i;
            else
            s = s+(double)a/i;
        }
        System.out.println("The sum of the series is "+s);
    }
}
