package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

public class Account {
    private int balance = 50; //balance em português é saldo

    public void withDrawal(int amount) { //withDrawl em português é saque
       this.balance = this.balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
