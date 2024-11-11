// Write a program to input ten different numbers . Display the sum of only odd numbers by using for loop
import java.util.*;
class odd_add_loop
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,n,sum = 0;
        for(i=1;i<=10;i++)
        {
            n = sc.nextInt();
            if(n%2!=0)
            sum=sum+n;
        }
        System.out.println("Answer is "+sum);
    }
}
