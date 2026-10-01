public class Account {
    private int id;
    private long balance;

    void deposit(Long amount) {
        this.balance = this.balance + amount;
        System.out.println("balance: " + this.balance);

    }

    void withDraw(Long amound) {
        if (amound <= this.balance){
            this.balance = this.balance - amound;
        System.out.println("balance: " + this.balance);
    }else System.out.println("😭😭😭😭");
}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
