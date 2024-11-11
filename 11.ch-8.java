//Write a program to display all the odd numbers from 1-10 by using the continue statement in a while loop.
class pg201
{
    public static void main()
    {
        int a =0;
        System.out.println("Output of the program");
        while(a<10)
        {
            a++;
            if(a%2==0)
            continue;
            System.out.println(a);
        }
    }
}
