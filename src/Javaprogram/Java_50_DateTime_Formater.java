package Javaprogram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class Java_50_DateTime_Formater {

    public static void main(String[]args) {
        //LocalDateTime dt = LocalDateTime.now();
       // System.out.println(dt);


       // DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy----E a");
       // DateTimeFormatter df1 =DateTimeFormatter.ISO_LOCAL_DATE;
       // String myDate=dt.format(df);
       // System.out.println(myDate);


        //Practise set on Advanced java
       //P1
        ArrayList ar=new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
       // ar.add("Student 1");
      //  ar.add("Student 1");
        for(Object o:ar)
        {
            System.out.println(o);
        }

        //P2

        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //P3
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        //P4

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String myDate=dt.format(df);
        System.out.println(myDate);



        //P5

        HashSet<Integer> h = new HashSet();
        h.add(84);
        h.add(82);
        h.add(11);
        h.add(89);
        h.add(99);
        h.add(91);
        h.add(91);
        h.add(96);
        h.add(94);
        System.out.println(h);




    }
}