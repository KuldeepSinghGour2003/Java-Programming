package Javaprogram;
class Phone
{
    public void greet()
    {
        System.out.println("Good morning:");
    }
    public void name()
    {
        System.out.println("My name is java:");
    }
}

class SmartPhone extends Phone
{
    public void swagat()
    {
        System.out.println("Ap ka swagat ha:");
    }
    public void name()
    {
        System.out.println("My name is java in class two:");
    }
}
public class Java_27_Dynamic_method {
    public static void main(String[]args)
    {
       Phone obj= new Phone();
       SmartPhone smobj= new SmartPhone();
        obj.name();

        Phone b1=new SmartPhone();
     // SmartPhone b2=new Phone();//Not allowed

        b1.greet();
        b1.name();//SmartPhone ka name call hoga
    }
}
