import java.util.Scanner;

public class bankAccount {
    /* The class has 4 instance variables:
    1. balance to store the current balance of the account
    2. previousTransaction to store the amount of the last transaction
        (either deposit or withdraw)
    3. customerName to store the name of the customer
    4. customerID to store the ID of the customer */
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    bankAccount(String cname, String cID) {
        customerName = cname;
        customerID = cID;
    }


    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw (int amount) {
        if (balance != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("DEPOSITED: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("WITHDRAW: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No Transaction Occurred");
        }
    }

    
    void showMenu() {

        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome " +customerName);
        System.out.println("Your ID " + customerID);
        System.out.println("\n");

        System.out.println("A : Check your balance");
        System.out.println("B : Deposit");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : EXIT");

        do {
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("Enter Your Option");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            option = scan.next().toUpperCase().charAt(0); // what doe this mean? - charAt(0) ? - how is it different from "next().char"
            System.out.println("\n");

            switch (option) {
                case 'A' -> {
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("--------------------------------------------------------------------------");
                }
                case 'B' -> {
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposit ");
                    System.out.println("--------------------------------------------------------------------------");
                    int amount = scan.nextInt(); // will program still work if this & next line are moved above case A?
                    deposit(amount); /* ANSWER: NO! - because we need the deposit() to run EXACTLY here at case B - aka
                                    'deposit functionality' */
                    System.out.println("\n");
                }
                case 'C' -> {
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw ");
                    System.out.println("--------------------------------------------------------------------------");
                    int amount2 = scan.nextInt();
                    withdraw(amount2); // Just like case B, we plug in withdraw() func here.
                    System.out.println("\n"); // see how the program looks w/out this line break.
                }
                case 'D' -> {
                    System.out.println("--------------------------------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("\n");
                }
                case 'E' ->
                        System.out.println("============================================================================");
                default -> System.out.println("Invalid! - Please choose again");
            }
        } while (option !='E');
        System.out.println("Thank You!");

    }


}
