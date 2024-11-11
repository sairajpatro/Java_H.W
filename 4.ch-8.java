//Write a program to accept any 10 numbers .Display the sum of only the negative numbers .
import java.util.*;
class pr4_pg190
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a = 1,n,sum= 0;
        while (a<=10)
        {
            n = sc.nextInt();
            if(n<0)
            sum = sum + n;
            a++;
        }
        System.out.println("Answer is"+sum);
    }
}
