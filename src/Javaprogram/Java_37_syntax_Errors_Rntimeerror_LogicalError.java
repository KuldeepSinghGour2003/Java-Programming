package Javaprogram;

import java.util.Scanner;

public class Java_37_syntax_Errors_Rntimeerror_LogicalError{
   public static void main(String[]args){
       //#Syntax Error
       //int a=0  No semicolan
       // b=8; Error b not declered



       //LOGICAL ERROR
       //print prime number
       for(int i=0;i<5;i++) {
          System.out.println(2*i+1);//Not print only prime number
       }

       //RUNTIME ERROR
       int k;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of k :");
       k = sc.nextInt();//Show an error if we divided by zero
       System.out.println("Integer part of 1000 divided by k is:"+1000/k);
   }
}