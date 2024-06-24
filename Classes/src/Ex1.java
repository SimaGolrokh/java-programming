public class Ex1 {
        // Variable representing current balance
        private int balance = 0;
        int depositAmount ;
        int withdrawAmount ;

        public Ex1(int depositAmount, int withdrawAmount) {
            this.depositAmount = depositAmount;
            this.withdrawAmount = withdrawAmount;
        }

        public void withdraw(int amount) {
            // Implement withdrawal logic
            if (amount <= balance) {
                balance -= amount;
            }
        }

        public void deposit(int amount) {
            // Implement deposit logic
            if (amount > 0) {
                balance += amount;
            }
        }

        public int getBalance() {
            // Implement logic to return current balance
            return balance;
        }

 public static void main(String[] args) {
    Ex1 ex1 = new Ex1(100, 100);
    System.out.println(ex1.getBalance());}