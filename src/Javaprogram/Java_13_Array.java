package Javaprogram;

public class Java_13_Array {
    public static void main(String[]args)
    {
        int []marks={ 92,83,54,29,80,89,95,38,10,99};
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }


        /*for(int element:marks)
        {
            System.out.println(element);
        }*/
    }
}
