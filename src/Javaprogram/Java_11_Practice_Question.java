package Javaprogram;
import java.util.Scanner;

public class Java_11_Practice_Question {
    public static void main(String[]args)
    {
        float tax=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the annual income:");
        float income= sc.nextFloat();
        if(income<2.5f)
        {
            tax=0;
        }
        else if(income<=5.0f)
        {
           tax = 0.05f * (income- 2.5f);
           //tax = tax + 0.2f * (income-5f);
        }
        else if(income<=10f)
        {
            tax =  0.05f* (5.0f - 2.5f);
            tax +=  0.2f * (income - 5.0f);

        }
        else
        {
            tax = 0.05f * (5.0f - 2.5f);
            tax += 0.2f * (10.0f - 5.0f);
            tax += 0.3f * (income - 10.0f);

        }
        System.out.println("Your total tax is: " + tax + " lakhs");
    }
}
