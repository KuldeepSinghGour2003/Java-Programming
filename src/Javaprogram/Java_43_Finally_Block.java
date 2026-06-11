package Javaprogram;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Java_43_Finally_Block {

    public static int greet() {
        try {
            int a = 100;
            int b = 2;
            int c = a / b;  // This will throw an exception (ArithmeticException)
            return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("This is end of program!");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a=10;
        int b=3;
        while(true)
        {
            try{
                System.out.println("The value after division:"+a/b);
             }
            catch (Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("The finally value of b is:"+b);
            }
            b--;
        }

        try{
            System.out.println(100/10);
        }
        finally {
            System.out.println("Try can be run!");
        }
    }
}/*
//Practise set problem
 public static void main(String[]args)
 {


     boolean flag = true;
     int[] marks = new int[4];
     marks[0] = 95;
     marks[1] = 96;
     marks[2] = 97;
     marks[3] = 98;
     Scanner sc = new Scanner(System.in);
     int ind;
     int i = 0;
     while (flag && i<5) {
         try {
             System.out.println("Enter the value of index:");
             ind = sc.nextInt();
             System.out.println("The value of marks[ind] is :" + marks[ind]);
         } catch (Exception e) {
             System.out.println("Invalid index!");
             i++;
         }
     }

 }
}*/