// Wite a program to accept a number and check whether the number is a palindrome or not. Display the message accordingly
// Sample Input = 707
// Sample Output = 707 is a palindrome number
import java.util.*;
class palindrome
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int d,n,p,r=0;
        System.out.println("enter a number");
        n = sc.nextInt();
        p=n;
        do
        {
            d = n%10;
            r = r*10+d;
            n = n/10;
        }
        while(n!=0);
        if(r==p)
        System.out.println("It is palindrome number");
        else
        System.out.println("It is not a palindrome number");
    }
}
