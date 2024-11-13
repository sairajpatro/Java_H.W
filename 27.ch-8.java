/* Write a program to input a number. Display the sum of each digit, raised to power of the number of digits.
 * Sample Input - 425
 * Sample Output - Number of digits = 3
 * Result = 4³ + 2³ + 5³ = 64 + 8 + 125 = 197
 */
import java.util.*;
class Sum_digits
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int i,d,n,p,c=0,s=0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        p=n;
        for(i=n;n>0;n=n/10)
        {
            d = n%10;
            c = c+1;
        }
        System.out.println("Number of digits are"+c);
        for(i=p;p>0;p=p/10)
        {
            d=p%10;
            s = s+(int)Math.pow(d,c);
        }
        System.out.println("The result is "+s);
    }
}
