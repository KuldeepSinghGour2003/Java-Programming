package Javaprogram;

abstract class Parent2
{
    public Parent2()
    {
        System.out.println("Mai parent2 ka constructor hoon");
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2
{
     @Override
     public void greet()
     {
         System.out.println("Good Morning");
     }
     @Override
     public void greet2()
     {
         System.out.println("Good Afternoon");
     }

}

abstract class Child3 extends Parent2
{
    public void happy()
    {
        System.out.println("I am enjoying a holiday");
    }
}
public class Java_29_Abstract_ClassAndMethods {
    public static void main(String[]args)
    {
        //Parent2 p=new Parent2(); Abstract can not make objects
        Child2 c = new Child2();
        //Child3 ch=new Child3();  Abstract can not make objects

    }
}
