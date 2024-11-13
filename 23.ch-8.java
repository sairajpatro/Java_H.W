// Write a program in java to display the first 10 numbers of the Fibonacci series : 0,1,1,2,3,---------------.
class Fibonacci
{
    public static void main()
    {
        int a=0,b=1,c=0,n=3;
        System.out.println("The Fibonacci is ");
        System.out.println(a);
        System.out.println(b);
        do
        {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            n = n+1;
        }
        while(n<=10);
    }
}
