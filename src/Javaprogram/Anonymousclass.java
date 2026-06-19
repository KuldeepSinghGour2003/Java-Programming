package Javaprogram;


interface Practical{
    void present();
}
public class Anonymousclass {
    public static void main(String[] args) {
        Practical pr = new Practical(){  // Reference object of Interface
            @Override
            public void present() {
                System.out.println("Presenting a Anonymous Class!");
            }
        };   // Important to put colon
    }
}
