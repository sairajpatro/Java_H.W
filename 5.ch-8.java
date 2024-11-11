//Write a program to input a number .Display all the digits of the number by using while loop
//Sample Input - 372
//Sample output - 2
//                7
//                3
import java.util.*;
class pr5_pg191
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        int b = sc.nextInt();
        System.out.println("the digits are ");
        while(b>0)
        {
            a=b%10;
            System.out.println(a);
            b=b/10;
        }
    }
}
