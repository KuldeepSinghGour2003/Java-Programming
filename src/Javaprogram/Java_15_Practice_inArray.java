package Javaprogram;
import java.util.Scanner;

public class Java_15_Practice_inArray {
    public static void main(String[]args)
    {
        /*float [] marks={81.1f,82.3f,86.7f,85.8f,98.2f};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        float num=sc.nextFloat();
        boolean isInArray=false;
       for(float element:marks)
        {
            if(num==element)
            {
                isInArray=true;
                break;
            }
        }
       if(isInArray)
       {
           System.out.println("The value is present in thr array");
       }else {
           System.out.println("The value is not present in thr array");
       }
        // Practice Problem 6

            int [] arr = {1, 2100, 3, 455, 5, 34, 67};
            int max = Integer.MIN_VALUE;
            for(int e: arr){
                if(e>max){
                    max = e;
                }
            }
            System.out.println("the value of the maximum element in this array is: "+ max);


            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);
    */

        int [][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                {0, 0, 0}};

        for (int  i=0;i<mat1.length;i++){ // row number of times
            for ( int j=0;j<mat1[i].length;j++) { // column number of time
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                //System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }

        }


        for ( int i=0;i<mat1.length;i++){ // row number of times
            for ( int j=0;j<mat1[i].length;j++) { // column number of time
              //  System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }


    }
}
