// Write a program in java to find and display the sum of the factorial of all the natural numbers from 1-n.
// S = 1! + 2! + 3! + 4! + ----------------------   +n!
import java.util.*;
class SumFactorial
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,n,f=1,s=0;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f = f*i;
            s = s+f;
        }
        System.out.println("The sum of factorial of numbers ="+s);
    }
}
