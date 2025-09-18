package lab3;

/**
 *
 * @author krisb
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client1=
                new Client("01","Karla","60365898","Limon");
        
        Client client2=
                new Client("02","Ale","70235698","San Jose");
        
        SavingAccount account1=
                new SavingAccount("2025-09-15", 10, 5, "162115",15000,client1,"Wink");
        
        CheckingAccount account2=
                new CheckingAccount(5,"56987524", 10000, client2,"Wink");
      
        account1.deposit(500);
        account2.withdraw(400);
        
        account1.interestCalculation();
        account2.interestCalculation();
        
        Sinpe.transfer(account1, account2,600);
        
        System.out.println("Karla's Balance: "+ account1.getBalance());
        System.out.println("Ale's Balance: " + account1.getBalance());
        
        System.out.println(account1.toString());
        System.out.println(account2.toString());
        
        Logbook.show();
        
        
        
    }
    }
   
