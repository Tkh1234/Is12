package Melnikov.HomeWork7;

public class BankAccount {
    int toppingUpYourAccount;
    int withdrawalFromTheAccount;

    int replenishment(int score) {
        toppingUpYourAccount += score;
        return toppingUpYourAccount;
    }

    int withdrawal(int score) {
        withdrawalFromTheAccount -= score;
        return withdrawalFromTheAccount;
    }

    void showInfo() {
        System.out.println("Пополнение: " + toppingUpYourAccount + " Снятие: " + withdrawalFromTheAccount);
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.toppingUpYourAccount = 1200;
        bA.withdrawalFromTheAccount = 1200;


        bA.replenishment(476);
        bA.withdrawal(751);
        bA.showInfo();
    }
}