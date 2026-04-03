import java.util.Scanner;

interface BankInterface {
    void deposit(double a);
    void withdraw(double a);
    void showBalance();
}

class Customer {
    String name;
    int id;

    Customer(String n, int i) {
        name = n;
        id = i;
    }
}

class Account extends Customer implements BankInterface {
    double balance;

    Account(String n, int i, double b) {
        super(n, i);
        balance = b;
    }

    public void deposit(double a) {
        balance += a;
    }

    public void withdraw(double a) {
        if (a <= balance)
            balance -= a;
        else
            System.out.println("Insufficient balance");
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankDetails {
    public static void main(String[] args) {
        Account a = new Account("Harshita", 101, 5000);

        a.deposit(1000);
        a.withdraw(2000);
        a.showBalance();
    }
}