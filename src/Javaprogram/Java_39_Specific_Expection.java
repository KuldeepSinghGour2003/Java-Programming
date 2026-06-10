package Javaprogram;

import java.util.Scanner;

public class Java_39_Specific_Expection {
    public static void main(String[]args)
    {
        int []marks=new int[3];
        marks[0]=6;
        marks[1]=98;
        marks[2]=10;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array idex:");
        int ind=sc.nextInt();

        System.out.println("Enter the number you want to divide value with:");
        int number=sc.nextInt();
        try{
            System.out.println("The value at array index entered is :"+marks[ind]);
            System.out.println("The value at array-value/number is :"+marks[ind]/number);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmaticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException!");
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println("Some occured!");
            System.out.println(e);
        }



    }
}
