package Javaprogram;

public class Java_19_Practice_seton_Methods {

    static void multiplication(int n)
    {
            System.out.format("The table of the given number is:\n");

        for(int i=1;i<=10;i++)
        {
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n)
    {
        System.out.println("The Pattern is;");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
    static int  sumRec(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n + sumRec(n-1);
        }

    }

    public static void main(String[]args)
    {
       multiplication(9);
       pattern1(5);
       int c=sumRec(20);
       System.out.println("The sum of natural numbers is:"+c);
    }
}
