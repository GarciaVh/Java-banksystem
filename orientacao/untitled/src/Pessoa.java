public class Pessoa {

    private int accnumber;
    private String accholder;
    private double balance;

    public Pessoa(int accnumber, String accholder) {
        this.accnumber = accnumber;
        this.accholder = accholder;
    }

    public Pessoa(int accnumber, String accholder, double initialbalance) {
        this.accnumber = accnumber;
        this.accholder = accholder;
        deposit(initialbalance);
    }

    public Pessoa() {

    }

    public int getAccnumber() {
        return accnumber;
    }


    public String getAccholder() {
        return accholder;
    }

    public void setAccholder(String accholder) {
        this.accholder = accholder;
    }

    public double getBalance() {
        return balance;
    }

    public void Initialbalance (double Initialbalance) {
        this.balance = Initialbalance;
    }

    public void deposit (double amount) {
        balance= balance + amount;
    }

    public void withdraw (double amount) {
        balance = balance - amount + 5;
    }
}

