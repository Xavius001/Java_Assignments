package ExceptionAssignment;

import java.util.Scanner;

class NOTSUFFICIENTBALANCE extends Exception {
    public NOTSUFFICIENTBALANCE(String s) {
        super(s);
    }       //custom exception that prints a message for user error
}

interface ITransaction {        //interface created for BankAccount
    void Deposit(double amt);
    void Withdrawal(double amt);        //these methods will be overridden in bank account class
    String Display();
}

class BankAccount implements ITransaction {
    private int AccountID;
    private String AccountHoldername;
    private double Balance;
    private static double MinBal = 3000;        //balance cannot go below 3000

    public BankAccount(int AccountID, String AccountHoldername, double Balance) {
        this.AccountID = AccountID;
        this.AccountHoldername = AccountHoldername;
        this.Balance = Balance;
    }

    @Override
    public void Deposit(double amt) {
        Balance += amt;
    }       //adds amount to balance via deposit

    @Override
    public void Withdrawal(double amt) {
        try {
            if(Balance-amt>=MinBal) Balance -= amt;     //removes amount from balance if its more or equal to 3000
            else throw new NOTSUFFICIENTBALANCE("Balance not sufficient");      //throws exception to catch block if the withdrawal amount is too big
        }
        catch(NOTSUFFICIENTBALANCE E) {     //catches the exception thrown from above
            System.out.println(E.getMessage());     //prints out the message that was thrown from the exception above
        }
    }

    @Override
    public String Display() {
        return AccountID+"\t"+AccountHoldername+"\t"+Balance;       //prints out bank account details
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);     //scanner to read user input
        ITransaction B = new BankAccount(1690, "Xavier", 4000);     //runtime polymorphism with parameters
        boolean repeat = true;      //used to control the loop
        while (repeat) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int input = S.nextInt();        //takes user input as an integer
            if(input==1) {
                System.out.print("Enter deposit amount: ");
                double amt = S.nextDouble();    //takes user input as double
                B.Deposit(amt);     //deposits user input into bank account
                S.nextLine();       //menu is repeated on a new line
            }
            else if(input==2) {
                System.out.print("Enter withdrawal amount: ");
                double amt = S.nextDouble();        //takes user input as double
                B.Withdrawal(amt);      //withdraws user input from bank account
                S.nextLine();       //menu is repeated on a new line
            }
            else if(input==3) {
                System.out.println(B.Display());        //displays bank account details
            }
            else if(input==4) {
                repeat = false;     //terminates the program
            }
            //if a number lesser than 1 or greater than 4 is entered the menu will repeat itself
        }
    }
}
