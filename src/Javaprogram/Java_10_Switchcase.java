package Javaprogram;
import java.util.Scanner;

public class Java_10_Switchcase {
    public static void main(String[]args)
    {
        int range;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range of Numbers:");
        range=sc.nextInt();
      //  System.out.println("Enter the range of Numbers:");
     //   range = integer/10;
        switch(range)
        {
            case 1:
                System.out.println("The number is less than 10!");
                break;
            case 2:
                System.out.println("The number is less than 20!");
                break;
            case 3:
                System.out.println("The number is less than 30!");
                break;
            case 4:
                System.out.println("The number is less than 40!");
                break;
            case 5:
                System.out.println("The number is less than 50!");
                break;
            case 6:
                System.out.println("The number is less than 60!");
                break;
            case 7:
                System.out.println("The number is less than 70!");
                break;
            case 8:
                System.out.println("The number is less than 80!");
                break;
            case 9:
                System.out.println("The number is less than 90!");
                break;
            case 10:
                System.out.println("The number is less than 100!");
                break;
                default:
                System.out.println("The number is not defined");
        }
    }
}
