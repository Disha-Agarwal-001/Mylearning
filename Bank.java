class Bank {
    static int balance = 1000;
    static void deposit(int amt) {
        balance= balance+amt;
    }
    static void withdraw(int amt) {
        balance=balance-amt;
    }
    static void display(int amt) {
        System.out.println("Your current available balance is>>"+balance);
    }
    public static void main(String args[]) {
        deposit(200);
        withdraw(500);
        display(balance);
    }
} 