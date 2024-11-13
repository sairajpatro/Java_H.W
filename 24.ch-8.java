// Write a program in java to enter a number and display the sum of its digits.
// Sample input = 642
// Sample Output = 12(6+4+2=12)
import java.util.*;
class digits
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,n,s=0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        while(n>0)
        {
            a = n%10;
            s = s+a;
            n = n/10;
        }
        System.out.println("The sum of the digits is "+s);
    }
}
