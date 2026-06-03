package Javaprogram;


class Base1{

    Base1()
    {
        System.out.println("I am a constructor");
    }

    Base1(int x)
    {
        System.out.println("I am an overload  constructor with value of x:"+x);
    }
}

class Derived1 extends Base1{


     Derived1()
     {
         super(0);
         System.out.println("I am in the derived class constructor:");
     }
    Derived1(int x,int y)
    {
        super(x);
        System.out.println("I am an overloaded constructor in the derived class constructor:"+y);
    }
}

class childOfDerived extends Derived1{

    childOfDerived()
    {
        System.out.println("I am the child class constructor:");
    }
    childOfDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am an overload  constructor with value of z:"+z);
    }
}
public class Java_25_ConstructorIn_Inheritance {
    public static void main(String[]args)
    {
        Base1 b=new Base1();
      //  Derived1 d=new Derived1();
        Derived1 d=new Derived1(19,99);
        //childOfDerived cd=new childOfDerived();
        childOfDerived cd = new childOfDerived(99,89,92);
    }
}
