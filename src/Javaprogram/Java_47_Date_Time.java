package Javaprogram;
import javax.sound.midi.SysexMessage;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Java_47_Date_Time {
    public static void main(String[]args)
    {
        //System.out.println(System.currentTimeMillis()/1000/3600);
        //Date class Quiz
        //System.out.println(Long.MAX_VALUE);
        //System.out.println(System.currentTimeMillis());
       // Date d=new Date();
      //  System.out.println(d);
      //  System.out.println(d.getTime());
      //   System.out.println(d.getDate());
      //   System.out.println(d.getYear());



       //  Calendar c= Calendar.getInstance();
         //System.out.println(c.getCalendarType());
       // System.out.println(c.getTimeZone());

       // Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
    }
}

