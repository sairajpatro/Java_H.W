//Write a program to input a set of numbers .The program checks each number whether it is a positive or a negative number . The loop should terminate when 0 is entered by the user.
import java.util.*;
class pg198
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int i,n;
        do
        {
            System.out.println("Enter a number and 0 to terminate");
            n = sc.nextInt();
            if(n==0)
            break;
            if(n>0)
            System.out.println(n+" is a positive number ");
            else 
            System.out.println(n+" is a negative number");
        }
        while(true);
        System.out.println("Program terminates");
    }
}
