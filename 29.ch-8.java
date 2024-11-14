// Write a program to display the sum of positive even numbers and negative odd numbers from a list of numbers entered by the user.
// The list terminates whem the user enteres 0 from the console
import java.util.*;
class Sum
{
    public static void main()
    {
        Scanner sc =new Scanner (System.in);
        int n,s1=0,s2=0;
        while(true)
        {
            System.out.println("Enter a number and 0 to terminate the program");
            n = sc.nextInt();
            if(n==0)
            break;
            if(n>0&&n%2==0)
            s1 = s1+n;
            if(n<0&&n%2!=0)
            s2 =s2+n;
        }
        System.out.println("Sum of positive even numbers = "+s1);
        System.out.println("Sum of negative odd numbers ="+s2);
        System.out.println("Program terminates");        
    }
}
