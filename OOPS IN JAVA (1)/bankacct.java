abstract class BankAccount {
    abstract void deposit(long money);

    abstract void withdraw(long amount);
}

class SavingsAccount extends BankAccount {
    public String name = "";
    long savings = 0;

    void deposit(long money) {
        this.savings += money;
        System.out.println("After depositing " + money);
        System.out.println("Savings account balance is = " + this.savings);
    }

    void withdraw(long amount) {
        this.savings -= amount;
        System.out.println("After withdrawing " + amount);
        System.out.println("Savings account balance is = " + this.savings);
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Current account balance is = " + this.savings);
    }
}

class CurrentAccount extends BankAccount {
    long cash = 0;
    public String name = "";

    void deposit(long money) {
        this.cash += money;
        System.out.println("After depositing " + this.cash);
        System.out.println("Current account balance is = " + this.cash);
    }

    void withdraw(long amount) {
        this.cash -= amount;
        System.out.println("After withdrawing " + this.cash);
        System.out.println("Current account balance is = " + this.cash);
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Current account balance is = " + this.cash);
    }
}

public class bankacct {
    public static void main(String[] args) {
        CurrentAccount acc = new CurrentAccount();
        System.out.println("savings account : ");
        acc.name = "Taksmaster875";
        acc.deposit(100000000);
        acc.withdraw(200000);
        System.out.println();
        System.out.println("displaying the details of Savings Account");
        acc.display();
        System.out.println();
        SavingsAccount acc2 = new SavingsAccount();
        System.out.println("Current account transactions: ");
        acc2.name = "Wintersoldier875";
        acc2.deposit(200000000);
        acc2.withdraw(200000);
        System.out.println();
        System.out.println("displaying the details of Current account");
        acc2.display();
    }
}