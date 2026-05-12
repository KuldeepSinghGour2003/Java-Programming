package Javaprogram;
import java.util.Scanner;

public class Java_18_Recursion {

    static int factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }
    }

    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        int result;
        Java_18_Recursion obj = new Java_18_Recursion();
        result=obj.factorial( n);
        System.out.println("The factorial of given number is :"+result);

    }
}
