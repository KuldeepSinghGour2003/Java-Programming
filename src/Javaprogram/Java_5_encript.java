package Javaprogram;
import java.util.Scanner;

public class Java_5_encript {
    public static void main(String[]args)
    {
        //Problem 1
        char grade='A';
        grade = (char)(grade+8);
        System.out.println("The Encripting data is:"+ grade);//Encripting a data

        grade = (char)(grade-8);
        System.out.println("The Decripting data is:"+ grade);//Decripting a data

        //Problem 2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int r=sc.nextInt();
        System.out.println( r>8);


    }
}
