public class Ex1 {
    // Variable representing current balance
    private int balance ;
    int depositAmount;
    int withdrawAmount;

    public Ex1(int depositAmount, int withdrawAmount) {
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
        this.balance = depositAmount - withdrawAmount;
    }

    public void withdraw(int withdrawAmount) {
        // Implement withdrawal logic
        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
        }
    }

    public void deposit(int depositAmount) {
        // Implement deposit logic
        if (depositAmount > 0) {
            balance += depositAmount;
        }
    }

    public int getBalance() {
        // Implement logic to return current balance
        return balance;
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1(150, 100);

        int balance = ex1.getBalance();
        System.out.println(balance);
    }
}