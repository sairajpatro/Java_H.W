// Write a program to input 10 different numbers.Display the greatest and the smallest numbers among them.
import java.util.*;
class Maxmin
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a,m,n,max=0,min=0;
        System.out.println("Enter the first number");
        n = sc.nextInt();
        min = n;max = n;
        for(a=2;a<=10;a++)
        {
            System.out.println("Enter the remaining nine numbers ");
            m = sc.nextInt();
            if(m<min)
            min = m;
            if(m>max)
            max = m;
        }
        System.out.println("Greatest number is "+max);
        System.out.println("Smallest number is "+min);
    }
}
