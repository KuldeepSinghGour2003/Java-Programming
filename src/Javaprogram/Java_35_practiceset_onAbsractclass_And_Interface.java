package Javaprogram;

abstract class Pen
{
   abstract void write();
   abstract void refill();

}
class FountainPen extends Pen
{
    void write()
    {
        System.out.println("I am writing a lettee!");
    }
    void refill()
    {
        System.out.println("I am doing refilling a ink in pen1");
    }
    void changeNib()
    {
        System.out.println("Changing a Nib of pen!");
    }

}

class Monkey
{
    void jump()
    {
        System.out.println("Monkey is jumping on the tree!");
    }
    void bite()
    {
        System.out.println("Monkey can be bite a banana!");
    }
}

interface BasicAnimal
{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("Human be able for speaking!");
    }
   public void eat()
    {
        System.out.println("Eating a food!");
    }
    public void sleep()
    {
        System.out.println("Sleeping!");
    }

}
public class Java_35_practiceset_onAbsractclass_And_Interface {
    public  static void main(String[]args)
    {
        //P1+P2
        FountainPen pe=new FountainPen();
        pe.write();
        pe.refill();
        pe.changeNib();
        //P3
        Human ma=new Human();
        ma.speak();
        ma.eat();
        ma.sleep();

        //P5
        Monkey m1=new Human();
      //  m1.speak();  Cannot use spaek method because the refrence is monkey which does not have speak method
          m1.bite();
          m1.jump();

          BasicAnimal ba=new Human();
          ba.eat();
          ba.sleep();
          //ba.speak(); Cannot use spaek method because the refrence is monkey which does not have speak method

    }
}
