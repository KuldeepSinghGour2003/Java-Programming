package Javaprogram;

import java.util.ArrayList;

public class Java_45_LinkedList {
    public static void main(String[]args)
    {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(8);
        l2.add(987);
        l2.add(935);
        l2.add(914);
        l2.add(897);
        l2.add(895);

        l1.add(1);
        l1.add(195);
        l1.add(19);
        l1.add(12);
        l1.add(11);
        l1.add(10);
        l1.add(16);
        l1.add(12);
        l1.add(16);
        l1.add(0,90);
        l1.add(0,97);
        l1.addAll(l2);

        l1.addLast(986);
        l1.addFirst(999);
        System.out.println(l1.contains(19));
        System.out.println(l1.indexOf(12));
        System.out.println(l1.lastIndexOf(12));
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
