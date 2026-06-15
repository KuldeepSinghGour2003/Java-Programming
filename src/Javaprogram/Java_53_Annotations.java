package Javaprogram;

@FunctionalInterface
interface myFunctionalInterface
{
  void meth1();
  //void math2();
}
class NewPhone extends Phone
{
  @Override
    public void greet() {
      System.out.println("Good morning:");

  }



  @Deprecated
  public int sum(int a,int b)
  {
      return a+b;
  }

}
public class Java_53_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[]args)
    {
      NewPhone  np=new NewPhone();
      np.greet();
      np.sum(9,8);
    }
}
