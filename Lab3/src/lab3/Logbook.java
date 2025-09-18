package lab3;

import java.time.LocalDateTime;

/**
 *
 * @author krisb
 */
public class Logbook {
   
    private static String[] events = new String[100];
    private static int counter = 0; 
    public static void register(String event, Account account, double amount) {
        if (counter < events.length) {
            String record = (counter + 1) + " | " + event +
                    " | Date: " + LocalDateTime.now() + 
                    " | Account: " + account.getBalance() + 
                    " | Amount: " + amount; 
            events[counter] = record; 
            counter++; 
        } 
    } 
    public static void show() { 
        
        System.out.println("\n--- LOG ---"); 
        for (int i = 0; i < counter; i++) { 
            System.out.println(events[i]); 
        } 
    } 
   
}
