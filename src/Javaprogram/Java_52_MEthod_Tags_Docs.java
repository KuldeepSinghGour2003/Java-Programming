package Javaprogram;

/**
 * This is a good class
 */

public class Java_52_MEthod_Tags_Docs {
    /**
     *
     * @param args These are argument passed to the command line
     */
    public static void main(String[]args)
    {
        System.out.println("I am a main method!");
    }

    /**
     *
     * @param i This is first number
     * @param j This is second number
     * @return this is sum of two number
     * @throws Exception this is exception if i==0
     * @deprecated This method is depre   cated please use '+' operator
     */
    public int add(int i, int j) throws Exception
    {
        if(i==0)
        {
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
