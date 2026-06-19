package Javaprogram;

import java.util.Scanner;
class ATM{
    public int amount;
    public int balance;

    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount :");
         amount = sc.nextInt();
    }
    public int currentBalance(){
        int balance = amount;
        return balance;
    }
    public void withDraw()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdarw amount :");
        int withdraw = sc.nextInt();
        int balance = currentBalance();
        try {
            if (balance < withdraw)
                throw new ArithmeticException("Insufficient Balance!");

            else{
                balance = balance-withdraw;
                System.out.println("Available Balance:"+balance);
        }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

public class ExceptionHandling {
    public static void main(String[] args)  {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the amount :");
//        int amount = sc.nextInt();
//        int currentBalance(){}
        ATM ex = new ATM();
        ex.setData();
        ex.currentBalance();
        ex.withDraw();
    }
}
