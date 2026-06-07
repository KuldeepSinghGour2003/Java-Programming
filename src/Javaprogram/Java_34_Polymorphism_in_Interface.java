package Javaprogram;
interface Camera2
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

interface wifi2
{
    String[]getNetworks();
    void connecttoNetworks(String Network);
}
class MycellPhone2
{
    void callNumber(long PhoneNumber)
    {
        System.out.print("Calling"+PhoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting_____");
    }
}

class MySmartPhone2 extends MycellPhone2  implements wifi2,Camera2
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

public class Java_34_Polymorphism_in_Interface {
    public static void main(String[]args)
    {
        Camera2 cam=new MySmartPhone2();//This is smartPhone but, use as a camera
        //cam.getNetworks(); Not allowed
        cam.record4kvideo();
        MySmartPhone2 ph=new MySmartPhone2();
        ph.takeSnap();
        ph.recordVideo();
        ph.callNumber(930);
    }

}

