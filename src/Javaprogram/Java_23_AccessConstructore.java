package Javaprogram;

class Cylinder{

    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea()
    {
        return 2*Math.PI*radius+2*3.14*radius*height;//pi=Math.PI
    }
    public double volume()
    {
        return   Math.PI*radius*radius*height;
    }
}

public class Java_23_AccessConstructore
{

    public static void main(String[]args) {

       /* Cylinder cyl = new Cylinder();
        cyl.setHeight(12);
        int h = cyl.getHeight();
        System.out.println("The Height of cylinder:"+h);
        cyl.setRadius(5);
        int r = cyl.getRadius();
        System.out.println("The radius of cylinder:"+r);
        cyl.surfaceArea();
        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());
        */
        //USed for constructor
        Cylinder cyl = new Cylinder(9,12);
      //  cyl.setHeight(12);
        int h = cyl.getHeight();
        System.out.println(cyl.getHeight());
       // System.out.println("The Height of cylinder:"+h);
      //  cyl.setRadius(5);
        int r = cyl.getRadius();
        System.out.println(cyl.getRadius());
       // System.out.println("The radius of cylinder:"+r);
        //cyl.surfaceArea();
        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());

    }
}
