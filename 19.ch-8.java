// Write a program in java to accept a number and check whether it is a prime number or not. Finally, display the message accordingly.
import java.util.*;
class prime_number
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter your number ");
        a = sc.nextInt();
        for(b=1;b<=a;b++)
        {
            if(a%b==0)
            c = c+1;
        }
        if(c==2)
        System.out.println(a+" is a prime number ");
            else
            System.out.println(a+ " is not a prime number");
    }
}
