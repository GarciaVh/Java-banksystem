import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa;


        System.out.println("Enter Account Number");
        int accnumber = sc.nextInt();
        System.out.println("Enter Account Holder");
        sc.nextLine();
        String accholder = sc.nextLine();
        System.out.println("Is there an initial deposit? (y/n)");
        char decisao = sc.next().charAt(0);

        if (decisao == 'y'){
            System.out.println("Enter initial deposit value");
            double initialbalance = sc.nextDouble();
            pessoa = new Pessoa(accnumber, accholder, initialbalance);
            } else {
            pessoa = new Pessoa(accnumber, accholder);
            }
        System.out.println("Account data: ");
        System.out.println("Account number: "
                + pessoa.getAccnumber()
                + ", " + "Account holder: "
                + pessoa.getAccholder()
                + ", " + "Account Balance: "
                + pessoa.getBalance());

        System.out.println("You want to make a deposit or a withdraw? (y/n)");
        char decisao2 = sc.next().charAt(0);
        if (decisao == 'y') {

            System.out.println("1 - deposit, 2 - withdraw, 3 - exit");
        int  decisao3 = sc.nextInt();

        if (decisao3 == 1) {
            System.out.println("Enter a deposit value: ");
            double deposit = sc.nextDouble();
             pessoa.deposit(deposit);
            System.out.println("Updated account data: ");
            System.out.println("Account number: "
                    + pessoa.getAccnumber()
                    + ", " + "Account holder: "
                    + pessoa.getAccholder()
                    + ", " + "Account Balance: "
                    + pessoa.getBalance());
        } else if (decisao3 == 2) {
            System.out.println("Enter a withdraw value: ");
            double withdraw = sc.nextDouble();
            pessoa.withdraw(withdraw);
            System.out.println("Updated account data: ");
            System.out.println("Account number: "
                    + pessoa.getAccnumber()
                    + ", " + "Account holder: "
                    + pessoa.getAccholder()
                    + ", " + "Account Balance: "
                    + pessoa.getBalance());
            }
        } else {
            System.out.println("thanks for your services");
        }
    }}