// Write a menu driven program 
// : to accept a number from the user and to check whether it is a buzz number or not
// : to accept any 2 numbers and display their GCD
import java.util.*;
class Check
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter 1 to check a buzz number");
        System.out.println("Enter 2 to find GCD of 2 numbers");
        System.out.println("Enter your choice");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                int n;
                System.out.println("Enter a number");
                n = sc.nextInt();
                if(n%7==0 || n%10==7)
                System.out.println(n+" is a buzz number");
                else
                System.out.println(n+" is not a buzz number");
                break;
                case 2:
                    int a,b,t;
                    System.out.println("Enter first number");
                    a = sc.nextInt();
                    System.out.println("enter second number");
                    b = sc.nextInt();
                    while(a%b!=0)
                    {
                        t = a%b;
                        a = b;
                        b = t;
                    }
                    System.out.println("GCD os two numbers is "+b);
                    break;
                    default:
                        System.out.println("Wrong choice");
        }
    }
}
