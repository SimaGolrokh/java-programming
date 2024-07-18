public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, int startingBalance){
        this.owner = owner;
        this.balance = Math.max(startingBalance, 0);
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amt) {
        if (amt > 0) {
            this.balance = this.balance + amt;
            return amt;
        }

        return 0;
    }

    public double withdraw(double amt) {
        if (amt <= this.balance) {
            this.balance = this.balance - amt;
            return amt;
        }

        return 0;
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Wonder Woman",
                1000);

        bankAccount.withdraw(500);
        bankAccount.deposit(5000);
        bankAccount.withdraw(2000);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
