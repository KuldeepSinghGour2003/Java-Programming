/*package Javaprogram;

import java.util.ArrayDeque;

public class Java_46_ArrayDeque {
    public static void main(String[]args)
    {
        ArrayDeque<Integer> ad1= new ArrayDeque<>();
        ad1.add(14);
        ad1.add(11);
        ad1.add(19);
        ad1.add(16);
        ad1.add(18);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        ArrayList<Integer> list = new ArrayList<>(ad1);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(ad1.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}*/
package Javaprogram;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Java_46_ArrayDeque {
    public static void main(String[] args) {
        // Create an ArrayDeque and add elements
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(14);
        ad1.add(11);
        ad1.add(19);
        ad1.add(16);
        ad1.add(18);

        // Print the first and last elements
        System.out.println("First element: " + ad1.getFirst());
        System.out.println("Last element: " + ad1.getLast());

        // Convert ArrayDeque to ArrayList for index-based access
        ArrayList<Integer> list = new ArrayList<>(ad1);

        // Print all elements using a normal for loop
        System.out.print("All elements: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
