package Javaprogram;
import java.util.Scanner;

public class Java_9_ifelse {
    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
       //int age=sc.nextInt();
        System.out.println("Enter the age of person is:");
        int age=sc.nextInt();
        if(age==18)
        {
            System.out.println("He is come under a student!  ");
        }
        else
        {
            System.out.println("He is Younger person!  ");
        }

    }
}
