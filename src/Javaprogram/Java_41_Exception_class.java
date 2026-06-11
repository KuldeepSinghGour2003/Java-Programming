package Javaprogram;

import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String toString() {
        return "I am toString!";
    }
    //@Override
    public String getMessage(){
        return "I am a getMessage!";
    }
}
public class Java_41_Exception_class {
    public static void main(String[]args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vaue of a:");
        a=sc.nextInt();
        if(a<9) {
            try {
          //      throw new MyException();
                throw new ArithmeticException("I am a exception!");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Program finished!");
            }
            System.out.println("This Program finished!");
        }
    }
}
