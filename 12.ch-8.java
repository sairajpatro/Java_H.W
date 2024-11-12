// Write a program to display all the numbers from 1-10by using continue statement in a do-while loop.
class pg203
{
    public static void main()
    {
        int a =0;
        System.out.println("Output of the program");
        do
        {
            a++;
            if(a%2!=0)
            continue;
            System.out.println(a);
        }
        while(a<=10);
    }
}
