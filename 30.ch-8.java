// Write a program to input any 20 different numbers .Display the sum of those numbers which are divisible by 3 and5
import java.util.*;
class sum
{
    public static void mian()
    {
        Scanner sc = new Scanner (System.in);
        int n,i=1,sum=0;
        while(1<=20)
        {
            System.out.println("Enter a number one by one");
            n = sc.nextInt();
            if(n%3==0&&n%5==0)
            sum = sum + n;
            i++;
        }
        System.out.println("Sum of numbers ="+sum);
    }
}
