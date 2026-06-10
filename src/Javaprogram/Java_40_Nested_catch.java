package Javaprogram;

import java.util.Scanner;

public class Java_40_Nested_catch {
    public static void main(String[]args)
    {
        int []marks=new int[3];
        marks[0]=6;
        marks[1]=98;
        marks[2]=10;
       Scanner sc=new Scanner(System.in);
       int ind=sc.nextInt();
       try{
           System.out.println("Welcome to Nested try catch:");
           try{
               System.out.println(marks[ind]);
           }
           catch(ArrayIndexOutOfBoundsException e){
               System.out.println("This catch not exist");
               System.out.println("Exception in level2");

           }
       }
       catch(Exception e)
       {
           System.out.println("Exception in level1");
       }
    }
}
