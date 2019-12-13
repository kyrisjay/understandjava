package practise.javasePackage.banking;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("余额不足");
        } else {
            balance -= amount;
            System.out.println("成功取出：" + amount);
        }
    }
}
