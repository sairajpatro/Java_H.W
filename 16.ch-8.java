// Write a program to find and display the sum of the given series.
// s=1-a+a²+a³+-------------------------a¹⁰
import java.util.*;
class series
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,a;
        double s=0;
        System.out.println("Enter the value of a ");
        a = sc.nextInt();
        for(i=0;i<=10;i++)
        {
            if(i%2==0)
            s = s+Math.pow(a,i);
            else
            s = s - Math.pow(a,i);
        }
        System.out.println("The sum of series is "+s);
    }
}
