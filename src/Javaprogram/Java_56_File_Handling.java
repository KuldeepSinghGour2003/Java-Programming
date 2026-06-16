package Javaprogram;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Java_56_File_Handling {
    public static void main(String[] args) throws IOException {

        /*File MyFile=new File("Java56FileHandling");
        try {
            MyFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to make file!");
            throw new RuntimeException(e);
        }

        //Code to write a file

        try {
            FileWriter fileWriter = new FileWriter("Java56FileHandling");
            fileWriter.write("This is our first file in java");
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        //Code to Reading a file
        File MyFile = new File("Java56FileHandling");
        try {
            Scanner sc = new Scanner(MyFile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        */
       // Deleting a file
//        File MyFile = new File("Java56FileHandling");
//        if (MyFile.delete()) {
//            System.out.println("I have deleted my file:" + MyFile.getName());
//        }
//        else {
//            System.out.println("Some error are produced");
//        }
                try {
                    FileWriter fw = new FileWriter("java.txt");

                    fw.write("Welcome to Java File Handling");

                    fw.close();

                    System.out.println("Data written successfully");

                } catch(Exception e) {
                    System.out.println(e);
                }
            }
        }


