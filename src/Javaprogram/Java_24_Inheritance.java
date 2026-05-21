package Javaprogram;


class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in the base and setting X now:");
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am like a constructor;");
    }
}

     class Derived extends Base {
        int y;

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    public class Java_24_Inheritance {
        public static void main(String[] args) {
            //  Base B = new Base();
            //B.setX(4);
            //System.out.println(B.getX());
            Derived D = new Derived();
            D.setX(4);
            System.out.println(D.getX());


        }
    }