package Javaprogram;
import java.util.Scanner;
public class Java_12_Practice_of_loop {
    public static void main(String[]args) {
        //problem1
      /*  int n=5;
        for(int i=5;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print( "*" );
            }
            System.out.print("\n");
        }*/
        //problem2
       /* int n = 5;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + (2 * i);
           // System.out.println("The sum of First n numbers is:" + sum);
        }
        System.out.println("The sum of First even n numbers is:" + sum);
        */
        //problem3
       /* int n=5;
        System.out.printf("The table of the number is:\n");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%dx%d=%d\n",n,i,n*i);
        }*/
        /*
        problem3
        int n=5;
        System.out.printf("The table of the number is:\n");
        for(int i=10;i>0;i--)
        {
            System.out.printf("%dx%d=%d\n",n,i,n*i);
        }*/
        //problem4

       /* long n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the the number:");
         n =sc.nextLong();
        int i=1;
        int fact=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
          //  System.out.println(fact);
        }
        System.out.println("The factorial of number is:"+fact);
        */
        //problem 6
               /* for (int i = 1; i <= 5; i++)
                {
                    if (i == 3) {
                        continue;
                    }
                    System.out.println("i = " + i);

                 }
                 */


        // problem 7
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
    }

}
