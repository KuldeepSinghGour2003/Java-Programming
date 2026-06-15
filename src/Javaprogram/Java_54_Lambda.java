package Javaprogram;

@FunctionalInterface
interface Demoano
{
    void math1(int a);
   // void math2();
}

//class Kuldeep implements Demoano{
//    public void math1()
//    {
//        System.out.println("This is a interface implements! ");
//    }
//}




//class AnnoDemo implements Demoano
//{
//    public void display()
//    {
//        System.out.println("HELLO!");
//    }
//
//    public void math1()
//    {
//        System.out.println("This is math1 class ");
//    }
//
//    public  void math2()
//    {
//        System.out.println("This is math2 class ");
//
//    }
//}


public class Java_54_Lambda {
    public static void main(String[] args) {
//        Demoano ad = new AnnoDemo();
//        ad.math1();
//        ad.math2();

//
//        Demoano obj = new Demoano() {
//            @Override
//            public void math1() {
//
//            }
//
//            @Override
//            public void math2()
//
//            }
//        };
//        obj.math1();

//        Demoano obj=new Kuldeep();
//        obj.math1();

//        Lembda Expression
          Demoano obj=(a)->{
              System.out.println("This is math1!"+ a);
          };
          obj.math1(99);

    }
}