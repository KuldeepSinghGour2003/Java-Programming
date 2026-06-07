/*package Javaprogram;
// Program 1: Student Class Example
class Student {
    int rollNo;
    String name;
    double marks;

    // Method to set student details
    void setData(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        // Create Student objects
        Student s1 = new Student();
        Student s2 = new Student();

        // Set data
        s1.setData(1, "Alice", 89.5);
        s2.setData(2, "Bob", 92.3);

        // Display data
        s1.display();
        s2.display();
    }
}
Roll No: 1
Name: Alice
Marks: 89.5
        -------------------------
Roll No: 2
Name: Bob
Marks: 92.3
        -------------------------

// Program 2: Rectangle Area and Perimeter
class Rectangle {
    double length;
    double breadth;

    // Method to set data
    void setData(double l, double b) {
        length = l;
        breadth = b;
    }

    // Method to display area and perimeter
    void display() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
    public class Java_33_ReactangleClass {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setData(10.5, 6.2);
        rect.display();
    }


    }
}
Length: 10.5
Breadth: 6.2
Area: 65.1
Perimeter: 33.4

// Program 3 to store and display Employee details
        import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        System.out.print("Enter Employee ID: ");
        e.id = sc.nextInt();
        sc.nextLine(); // to skip enter key

        System.out.print("Enter Employee Name: ");
        e.name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        e.salary = sc.nextDouble();

        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }
}
Enter Employee ID: 101
Enter Employee Name: Rahul
Enter Employee Salary: 25000


// Program 3.1to find sum of two numbers
        import java.util.Scanner;

class Sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
Enter first number: 5
Enter second number: 7

// Program 3.2 to find subtraction of two numbers
        import java.util.Scanner;

class Subtract {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Subtraction = " + sub);
    }
}
Enter first number: 15
Enter second number: 8

output
        Subtraction = 7

// Program 3.3 to find multiplication of two numbers
import java.util.Scanner;

class Multiply {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int mul = a * b;
        System.out.println("Multiplication = " + mul);
    }
}
Input:
Enter first number: 9
Enter second number: 4

Output:
Multiplication = 36
// Program 3.4 to find division of two numbers
        import java.util.Scanner;

class Divide {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b != 0) {
            int div = a / b;
            System.out.println("Division = " + div);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}
Input:
Enter first number: 20
Enter second number: 4

Output:
Division = 5

// Program 3.5 to find modulus of two numbers
        import java.util.Scanner;

class Modulus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (b != 0) {
            int mod = a % b;
            System.out.println("Modulus = " + mod);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}
Input:
Enter first number: 10
Enter second number: 3

Output:
Modulus = 1
// Program 3.6 to find sum of digits of a 3-digit number
        import java.util.Scanner;

class SumOfDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int d1 = num / 100;
        int d2 = (num / 10) % 10;
        int d3 = num % 10;

        int sum = d1 + d2 + d3;
        System.out.println("Sum of digits = " + sum);
    }
}
Input:
Enter a three-digit number: 456

Output:
Sum of digits = 15


        package mystaticdemo;

// Q2.1 Class to demonstrate static variable and method
class Student {
    int rollNo;
    String name;
    static int count = 0; // Static variable shared by all objects

    Student(int r, String n) {
        rollNo = r;
        name = n;
        count++; // Increment count whenever a new object is created
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }

    static void showCount() {
        System.out.println("Total number of students: " + count);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Priya");
        Student s3 = new Student(3, "Amit");

        s1.display();
        s2.display();
        s3.display();

        Student.showCount(); // Call static method
    }
}
Output:
Roll No: 1, Name: Rahul
Roll No: 2, Name: Priya
Roll No: 3, Name: Amit
Total number of students: 3


        package mystaticdemo;

//Q3.2 Class with static methods
class MathUtility {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}

// Main class
public class MathDemo {
    public static void main(String[] args) {
        System.out.println("Square of 5 = " + MathUtility.square(5));
        System.out.println("Cube of 3 = " + MathUtility.cube(3));
    }
}
Output:
Square of 5 = 25
Cube of 3 = 27

        package mystaticdemo;

// Q3.3 Class with static block
class DemoStaticBlock {
    static {
        System.out.println("Static block is executed before main() method.");
    }

    static void runDemo() {
        System.out.println("Main method is executed inside static block demo.");
    }
}

// Main class
public class StaticBlockDemo {
    public static void main(String[] args) {
        DemoStaticBlock.runDemo();
    }
}
Output:
Static block is executed before main() method.
Main method is executed inside static block demo.
*/