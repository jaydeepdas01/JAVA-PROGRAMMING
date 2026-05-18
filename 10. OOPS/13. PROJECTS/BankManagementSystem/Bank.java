package BankManagementSystem;

public class Bank {
    BankAccount[] bankAccounts = new BankAccount[100];
    int count = 0;

    // adding bank users.
    void addAccount(BankAccount account) {
        bankAccounts[count] = account;
        count++;
    }

    // display all acounts
    void displayAllAccounts() {
        for (int i = 0; i < count; i++) {
            if (bankAccounts[i] != null) {
                System.out.println("A/c Type: " + bankAccounts[i].getAcType() +
                        ", A/c no.: " + bankAccounts[i].getAcNunber() +
                        " ,A/C Name : " + bankAccounts[i].getAcHolder() +
                        " ,Balance : " + bankAccounts[i].getBal());
            }
        }
    }

    // serach id by ac number
    void searchAccount(int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (bankAccounts[i].getAcNunber() == accountNumber) {
                System.out.println("A/c Type: " + bankAccounts[i].getAcType() +
                        ", A/c no.: " + bankAccounts[i].getAcNunber() +
                        " ,A/C Name : " + bankAccounts[i].getAcHolder() +
                        " ,Balance : " + bankAccounts[i].getBal());
                return;
            }
        }
    }

    // deposit money by ac number
    void depositMoney(int accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (bankAccounts[i].getAcNunber() == accountNumber) {
                bankAccounts[i].deposit(amount);
                return;
            }
        }
    }

    // withdraw by ac number
    void withdrawMoney(int accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (bankAccounts[i].getAcNunber() == accountNumber) {
                bankAccounts[i].withdraw(amount);
                return;
            }
        }
    }
}
