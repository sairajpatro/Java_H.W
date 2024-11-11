//Write a program to input a set of number .The program checks whether each number is a perfect square number or not.The program will terminate when zero is entered by the user
import java.util.*;
class pg196
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        int n;
        double p;
        while(true)
        {
            System.out.println("Enter a positive number and zero to terminate");
            n = sc.nextInt();
            if(n==0)
            break;
            p =Math.sqrt(n);
            if((int)p*p==n)
            System.out.println(n+" is a perfect square");
            else
            System.out.println(n+"is not a perfect square");
        }
        System.out.println("Program terminates");
    }
}
