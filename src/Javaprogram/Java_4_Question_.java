package Javaprogram;
import java.util.Scanner;

public class Java_4_Question_ {
    public static void main(String[]args)
    {
        System.out.println("Taking Input From user:");
        System.out.println("Percentage of Student in Exam:");
        Scanner sc= new Scanner(System.in);
        System.out.println("The marks of S1:");
        float S1=sc.nextFloat();
       // System.out.println("The marks of S1:");
        System.out.println("The marks of S2:");
        float S2=sc.nextFloat();
       // System.out.println("The marks of S2:");
        System.out.println("The marks of S3:");
        float S3=sc.nextFloat();
        //System.out.println(S3);
        System.out.println("The marks of S4:");
        float S4=sc.nextFloat();
        //System.out.println(S4);
        System.out.println("The marks of S5:");
        float S5=sc.nextFloat();
        //System.out.println(S5);
        float percentage=(S1+S2+S3+S4+S5)/5;
        System.out.println("The percentage of Student is :" + percentage);



    }
}
