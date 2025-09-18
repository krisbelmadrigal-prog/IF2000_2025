package lab3;

/**
 *
 * @author krisb
 */
public class CheckingAccount extends Account {
    
    private double interest;

    public CheckingAccount(double interest) {
        this.interest = interest;
    }

    public CheckingAccount(double interest, String accountNumber, double balance, Client accountHolder, String bank) {
        super(accountNumber, balance, accountHolder, bank);
        this.interest = interest;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    
    @Override
    public double interestCalculation() {
   
  
        double interestAmount = (getBalance()* interest)/12;
        setBalance(getBalance()+ interest);
        
        return getBalance();
    }

    @Override
    public void deposit(double amount) {
    if(amount>0){
        setBalance(getBalance()+amount);
    }
    }

    @Override
    public void withdraw(double amount) {
    if(amount<= this.getBalance())
       super.setBalance(this.getBalance()-amount);
        else 
            System.out.println("You dont have enough money");
    }
    
          @Override
    public String toString() {
        String result= "\nAccount Type: CHECKING ACCOUNT" 
                +"\n---------------"
                +"\nInterest: " +this.getInterest()
                +"\nBalance after interst: " + this.getBalance();
        
        return super.toString()+result;
                
    } 
    
   
}
