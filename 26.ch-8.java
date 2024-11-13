// Write a program to display the first 10 odd numbers stating from the number entered by the user
// Sample Input - 10
// Sample Output - 11,13,15-----------,29
import java.util.*;
class odd_num
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int c=1,n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        System.out.println("First 10 ood numbers from "+n+"are");
        do
        {
            if (n%2!=0)
            {
                System.out.println(n+"");
                c++;
                n++;
            }
            else
            n++;
        }
        while(c<=10);
    }
}
