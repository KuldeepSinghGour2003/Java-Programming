package Javaprogram;

//class MyThread implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++) {
//            System.out.println("Runnable Interface:"+i);
//            try{
//                Thread.sleep(2000);
//            }catch(Exception e){
//                System.out.println("Handling Exception!");
//            }
//        }
//    }
//}
class MyThread extends Thread{
    public void run(){
        Thread  t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);

        t.setName("MultipleThreads");
        System.out.println(t.getName());


        for(int i=0;i<5;i++) {
            System.out.println("Runnable Interface:"+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Handling Exception!");
            }
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
//        Thread  t = new Thread(t1);  // It is used for implements Runnable interface in Thread class
//        Thread  t = Thread.currentThread();
//        String name = t.getName();
//        System.out.println(name);
//
//        t.setName("MultipleThreads");
//        System.out.println(t.getName());
        t1.start();
    }
}
