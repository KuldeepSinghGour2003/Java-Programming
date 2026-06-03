package Javaprogram;

class Demo{
    public int sum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public void display(String[] arr){
        System.out.println("String Anonymous :");
        for(String s:arr){
            System.out.println(s);
        }
    }

}
      public class AnonymousArrayandString {
      public static void main(String[] args) {
            Demo d1= new Demo();
            int result = d1.sum(new int [] {5,10,15,20});
            System.out.println("Sum of Anonymous Array:"+result);
            d1.display(new  String [] {"It","is","Perfect","one"});
        }
    }

