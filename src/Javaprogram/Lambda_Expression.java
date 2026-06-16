package Javaprogram;

interface Arithmatic{
    int cal(int a,int b);
}
public class Lambda_Expression {
    public static void main(String[] args) {
        Arithmatic a1 = (int x,int y)-> x+y;
        System.out.println("Addition in Lambda Expression:"+ a1.cal( 90,10));
    }

}
