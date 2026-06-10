package Javaprogram;

import javax.sound.midi.SysexMessage;

public class Java_38_Trycatch {
    public static void main(String[]arg)
    {
        int a=9000;
        int b=0;
     //   double c=(double)a/b;
       // System.out.printf("Result of c is:%.4f%n ",c);

        //Without try
      //  int c1 = a / b;
      //  System.out.printf("Resuit of c1 is:" + c1);
        //with try
        try {
            int c1 = a / b;
            System.out.printf("Resuit of c1 is:" + c1);
        }
        catch (Exception e)
        {
            System.out.println("We can not divide.Reason:");
            System.out.println(e);
        }
        System.out.println("End of progarm!");
    }
}
