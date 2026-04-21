package Javaprogram;
import java.util.Scanner;

public class Java_2_input
{
    public static void main(String[]args)
    {
        System.out.println("Taking input from user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number 1:");
        //Replace float =int , if I want integer value
        float a=sc.nextFloat();
        System.out.println("Enter the number 2:");
        float b=sc.nextFloat();
        float sum= a+b;
        System.out.println("The sum of number is :");
        System.out.println(sum);
        String str=sc.nextLine();
        System.out.println(str);
    }
}
