package Javaprogram;
/*
class C1 {
    public int x = 89;
    protected int y = 99;
    int z = 9;
    private int a = 96;

    public void math1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

    }
}
public class Java_36_Access_modifiers {
    public static void main(String[]args)
    {
        C1 ma=new C1();
        ma.math1();
        System.out.println("This is access process1");
        System.out.println(ma.x);
        System.out.println(ma.y);
        System.out.println(ma.z);
       // System.out.println(ma.a);It is private member

    }
}
*/
// File name: SumArgs.java
// This program adds two numbers given from the command line

public class Java_36_Access_modifiers {
    public static void main(String[] args) {
        // Check if two numbers are given
        if (args.length < 2) {
            System.out.println("Please give two numbers!");
            return;
        }

        // Convert (change) the arguments from String to integer
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Add the numbers
        int sum = num1 + num2;

        // Print the result
        System.out.println("Sum = " + sum);
    }
}
