// Using a switch case statement , write a menudriven program to convert a given temperature from fahrenheit and celsius and vice versa.
// For an incorrect choice , an appropriate error message should be displayed.
// Hint : C=5/9(F-32) and F=1.8*C+32
import java.util.*;
class Temperature
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        int ch;
        double c,f,c1,f1;
        System.out.println("Enter 1 to find the temperature from Fahreheit to celsius");
        System.out.println("Enter 2 to find the temperature from celsius to Fahrenhit");
        System.out.println("Enter your choice 1 or 2");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter temperature in fahrenheit ");
            f = sc.nextInt();
            c = (double)5/9*(f-32);
            System.out.println("The temperature in Celsius is"+c);
            break;
            case 2:
                System.out.println("Enter temperature in Celsius ");
                c1 = sc.nextInt();
                f1 = (double)1.8*c1+32;
                System.out.println("The temperature in fahrenheit is "+f1);
                break;
                default:
                    System.out.println("Wrong choice ");
        }
    }
}
