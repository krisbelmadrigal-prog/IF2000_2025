package domain;

/**
 *
 * @author krisb
 */
public abstract class Account {
    
    private String accountNumber;
    private double balance;
    private Person client;

    
    public Account () {
    
}
    
    public Account(String accountNumber, double balance, Person client) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }
    



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Person getClient() {
        return client;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClient(Person client) {
        this.client = client;
    }
    
    
    
    //ABSTRACTS METHODS FOR POLIMORFISM
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double interestCalculation();
    
    @Override
            public String toString() {
                String result = "\nBANK ACCOUNT INFROMATION:" 
                        +  "\n------------------------------------------------"
                        +  "\nACCOUNT NUMBER: " + this.getAccountNumber()
                        + "\nBALANCE: " + this.getBalance()
                        + "\nACCOUNT OWNER: " + this.getClient().toString()
                        +"\n";
               
                        
                return result;
                
            }
    
}
