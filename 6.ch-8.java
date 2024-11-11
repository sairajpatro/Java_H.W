//Write a program to input a number .Display all the digits of the number by stating whether it is an even or an odd digitby using do-while loop
//Sample Input - 891
//Sample Output - 1: It is an odd number
//                9: It is an odd number
//                8: It is an even number
import java.util.*;
class pg193
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int d,n;
        System.out.println("Enter a number");
        n = sc.nextInt();
        do
        {
            d = n%10;
            if(d%2==0)
            System.out.println("It is an Even number "+d);
              else
            System.out.println("It is an odd number "+d);
            n=n/10;
        }
        while(n>0);
    }
}
