/* Write a program to find the difference between Compound interest and simple interest.
 * The program terminates as soon as the user enters 0. Take principal,rate,and time as inputs from the console.
 */
import java.util.*;
class Interest
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int p,t,r,n=0;
        double a,ci,si,d;
        while(n!=0)
        {
            System.out.println("Enter principal");
            p = sc.nextInt();
            System.out.println("Enter Rate");
            r = sc.nextInt();
            System.out.println("Enter Time");
            t = sc.nextInt();
            si = (p*r*t)/100;
            a = p*(Math.pow((1 + 0.1*r),t));
            ci = a-p;
            d = ci-si;
            System.out.println("Simple Interest ="+si);
            System.out.println("Compound Interest ="+ci);
            System.out.println("The difference between both ="+d);
            System.out.println("Do you want to continue?");
            System.out.println("Enter 0 to terminate");
            n = sc.nextInt();
        }
        System.out.println("Program terminates");
    }
}
