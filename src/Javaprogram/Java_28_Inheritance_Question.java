package Javaprogram;
class Circle
{
    public int radius;

    Circle(int r)
    {
        System.out.println("I am parameterized constructor in circle class:");
        this.radius=r;
    }

    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;

    Cylinder1(int r,int h)
    {
        super(r);
        System.out.println("I am parameterized constructor in cylinder1 class:");
        this.height=h;
    }
     public double volume()
     {
         return Math.PI*this.radius*this.radius*this.height;
     }

}

public class Java_28_Inheritance_Question {
    public static void main(String[]args)
    {
        Circle c1=new Circle(12);
        //c1.area();
        System.out.println("Area of circle: " + c1.area());
        Cylinder1 cy= new Cylinder1(9,8);
        System.out.println("Volume of cylinder: " + cy.volume());
        //cy.volume();
    }
}
