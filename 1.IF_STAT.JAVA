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
