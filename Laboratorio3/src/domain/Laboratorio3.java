package domain;

/**
 *
 * @author krisb
 */
public class Laboratorio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person client1=
                new Person("Edgardo", "Corrales", "2-8957-5555", "60365898",18);
        
        SavingAccount account1=
                new SavingAccount("2025-09-04", 12, 5, "100587762115",25000, client1);
        
        //Simulation of deposit
        account1.deposit(3000);
        
        
        System.out.println(account1.toString());
        
        System.out.println("\n\n\n\n--------------------------------------");
        
        System.out.println(" Withdraw of money");
        
        System.out.println("--------------------------------------\n\n");
        
        account1.withdraw(16000);
        
        System.out.println(account1);
        
        
        
    }
    
}
