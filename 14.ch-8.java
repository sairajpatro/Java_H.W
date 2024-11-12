// Write a program to find and display the sum of any ten natural numbers.
import java.util.*;
class sum
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,n,s=0;
        for(a=1;a<=10;a++)
        {
            System.out.println("Enter a number ");
            n = sc.nextInt();
            s=s+n;
        }
        System.out.println("The sum of the numbers is "+s);
    }
}
