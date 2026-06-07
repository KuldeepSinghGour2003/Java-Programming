package Javaprogram;

interface Camera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning!");
    }
    default void record4kvideo()
    {
        greet();
        System.out.println("Recording 4K video______");

    }
}

interface wifi
{
    String[]getNetworks();
    void connecttoNetworks(String Network);
}
class MycellPhone
{
    void callNumber(int PhoneNumber)
    {
        System.out.print("Calling"+PhoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting_____");
    }
}

class MySmartPhone extends MycellPhone implements wifi,Camera
{
    public void takeSnap()
    {
        System.out.println("Taking sanp!");
    }
    public void recordVideo()
    {
        System.out.println("Video recording!");
    }

    public String[]getNetworks()
    {
        System.out.println("Getting list of Networks!");
        String[]networklist={"Kuldeep","Rahul","Gopal"};
        return networklist;
    }
    public void connecttoNetworks(String Network)
    {
        System.out.println("Connecting to"+Network);
    }


}

public class Java_31_InterfacewithDefault {
    public static void main(String[]args)
    {
        MySmartPhone m1 = new MySmartPhone();
        m1.record4kvideo();
        //m1.greet(); It is a private
        String[]ar=m1.getNetworks();
        for(String item:ar)
        {
            System.out.println(item);
        }
    }
}
