package Javaprogram;

public class Java_16_Methods {
    static int  logic(int x, int y)
    {
        int z;
        if(x>y)
        {
           z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }

    public static void main(String[]args)
    {
        //C0ndition1
        int a=8;
        int b=9;
        int c;
        c=logic(a,b);
        //Condition2
        int a1=8;
        int b1=10;
        int c1;
        c1=logic(a1,b1);
        System.out.print("The Condition1 executed:"+c);
        System.out.print("\nThe Condition2 executed;:"+c1);


    }
}
