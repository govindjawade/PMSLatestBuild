package JavaPractise.Inheritance1;

abstract class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited to savings: $" + amount);
    }
}

public class AbstractClassBanking {
    public static void main(String[] args) {
        BankAccount ba = new SavingsAccount(1000);  // ✅ Correct instantiation

        ba.deposit(500);         // ✅ Correct method call
        ba.showBalance();        // ✅ Shows updated balance
    }
}
