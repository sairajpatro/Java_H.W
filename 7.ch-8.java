// Write a program in Java to display the sum of any 2 numbers for 10iterations .If the sum of two numbers is negative then the program will terminate.
import java.util.*;
class pg195
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        for(d=1;d<=10;d++)
        {
            System.out.println("Enter two numbers");
            a = sc.nextInt();
            b = sc.nextInt();
            c = a+b;
            if (c<0)
            break;
            System.out.println("Sum of two numbers is "+c);
        }
        System.out.println("Program Terminates");
    }
}
