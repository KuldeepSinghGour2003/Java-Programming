package Javaprogram;

class Employee
{
   int id;
   String name;
   public void printDetails()
   {
       System.out.println("My id is:"+id);
       System.out.println("My name is:"+name);
   }

}
public class Java_20_JavaFirstClass {
    public static void main(String[]args)
    {
        System.out.println("This is our custom class!");
        Employee Kuldeep=new Employee();
        Kuldeep.id=99;
        Kuldeep.name="Kuldeep Singh Gour";
        //System.out.println(Kuldeep.id);
        //System.out.println(Kuldeep.name);
        Kuldeep.printDetails();
    }
}
