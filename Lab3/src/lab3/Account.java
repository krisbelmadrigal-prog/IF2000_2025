package lab3;

/**
 *
 * @author krisb
 */
public abstract class Account {
    
    private String accountNumber;
    private double balance;
    private Client accountHolder;
    private String bank;

    public Account() {
    }

    public Account(String accountNumber, double balance, Client accountHolder, String bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Client accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }
    
    
    
    //Metodos
    public abstract double interestCalculation();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    
    @Override
    public String toString(){
        String result = "\nBANK ACCOUNT INFROMATION:" 
                        +  "\n------------------------------------------------"
                        +  "\nACCOUNT NUMBER: " + this.getAccountNumber()
                        + "\nBALANCE: " + this.getBalance()
                        + "\nACCOUNT HOLDER: " + this.getAccountHolder().toString() 
                        + "\nbank: " + this.getBank()
                        +"\n";
        
        return result;
    }
    
}
