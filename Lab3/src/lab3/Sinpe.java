package lab3;

/**
 *
 * @author krisb
 */
public class Sinpe {

    public static void transfer(Account origin, Account destination, double amount) {
    if (origin.getBalance() >= amount) { 
        origin.withdraw(amount); 
        destination.deposit(amount); 
        Logbook.register("SINPE Transfer OUT", origin, -amount); 
        Logbook.register("SINPE Transfer IN", destination, amount); 
    } else { 
        System.out.println("Transfer failed: insufficient funds."); 
    } 
}
            
}
