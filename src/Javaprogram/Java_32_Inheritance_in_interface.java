package Javaprogram;

interface sampleInterface
{
    void math1();
    void math2();
}

interface childsampleInterface extends sampleInterface
{
    void math3();
    void math4();
}

class MysampleClass implements childsampleInterface
{
   public void math1()
    {
        System.out.println("I am math1:");
    }
    public void math2()
    {
        System.out.println("I am math2:");
    }
    public void math3()
    {
        System.out.println("I am math3:");
    }
    public void math4()
    {
        System.out.println("I am math4:");
    }
}


public class Java_32_Inheritance_in_interface {
    public static void main(String[]args)
    {
        MysampleClass my=new MysampleClass();
        my.math1();
        my.math2();
        my.math3();
        my.math4();

    }
}
