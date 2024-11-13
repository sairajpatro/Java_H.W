// Write a program in java to accept a number .Find and display all its factor(including 1& excluding the number itself).
// Sample input - 15,
// Outpu factors of 15 = 1,3,5.
import java.util.*;
class factors
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int a,n;
        System.out.println("Enter the number ");
        n = sc.nextInt();
        for(a=1;a<n;a++)
        {
            if(n%a==0)
            System.out.println(a+" is a factor of "+n);
        }
    }
}
