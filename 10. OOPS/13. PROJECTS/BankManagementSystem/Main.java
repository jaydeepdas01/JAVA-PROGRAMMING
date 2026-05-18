package BankManagementSystem;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Current Account", 1, "Jaydeep Das", 100000);
        BankAccount account2 = new BankAccount("Saving Account", 2, "Gaurav Pratap", 20000);
        BankAccount account3 = new BankAccount("Saving Account", 3, "Shekhar Das", 50000);

        // bank Object
        Bank bank = new Bank();
        // adding account object into array refereance
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // account1.withdraw(50000);
        // account1.deposite(10000);
        // account1.deposite(15000);
        // account1.displayDetails();
        // bank.displayAllAccounts();
        // account2.deposite(25000);
        // bank.searchAccount(2);
        bank.searchAccount(1);
        bank.depositMoney(1, 50000);
        bank.searchAccount(1);
        bank.withdrawMoney(2, 5000);
        bank.searchAccount(2);

        System.out.println("=======Display all account======");
        bank.displayAllAccounts();

    }
}
