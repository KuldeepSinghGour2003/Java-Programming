package Javaprogram;

import java.util.function.BiConsumer;

interface Bicycle
{
    int a=99;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle
{
    void blowHornk3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,HornBicycle
{
  //  public int a=99;
    void blowHorn()
    {
        System.out.println("Pee Pee Poo Poo!");
    }
    public void applyBrake(int decrement)
    {
        System.out.println("Applying Brake!");
    }
    public void speedUp(int increment)
    {
        System.out.println("Applying speedup!");
    }
    public void blowHornk3g()
    {
        System.out.println("Kabhi Khushi Kabhi gum pee pee pee pee ");
    }
    public void blowHornmhn()
    {
        System.out.println("Main hoo naa po po po po ");
    }
}

public class Java_30_Interfaces_inJava {
    public static void main(String[]args)
    {
        AvonCycle c1=new AvonCycle();
        c1.applyBrake(9);
        System.out.println(c1.a);
        c1.blowHornk3g();
        c1.blowHornmhn();
    }
}
