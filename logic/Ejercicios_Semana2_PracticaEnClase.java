package logic;

/**
 *
 * @author krisb
 */
public class Ejercicios_Semana2_PracticaEnClase {

    public Ejercicios_Semana2_PracticaEnClase() {
    }
    
    public void quiz2_A_primos(){
        
    } 
    
    public void quiz2_B_piramide(int n){
        
        for (int i = 1; i <= n; i++) {
            //controla los espacios vacios//
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }//endForInterno_A
            
            //controla los * de la piramide
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*"); 
            }//endForInterno_B
            System.out.println("");
        }//endMetodo
        
        System.out.println("");
        System.out.println("\n----------------------");
    } 
    public void ejercicio_A(){
        int n = 5; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
        System.out.println("\n----------------------");
    }

   
        public void ejercicio_B(int n){
            for (int i = n; i >= 1; i--) {
             for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
             System.out.println();
            }
            System.out.println("\n----------------------");
        }   
        
        public void ejercicio_C(int n){
            for (int i =1 ; i <=n; i++) {
                for (int j = 1; j <= (i-1); j++) {
                System.out.print(" ");
                }
             for (int j =i; j <= n; j++) {
                    System.out.print("*");
            }
             System.out.println();
            }
            System.out.println("\n----------------------");
        }
        
        public void ejercicio_D(){
        int[] n = {7, 2, 9, 1, 5, 3, 8, 6, 4, 0};

        //orden ascendente
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    // intercambio de numeros
                    n[j] = n[j] + n[j + 1];
                    n[j + 1] = n[j] - n[j + 1];
                    n[j] = n[j] - n[j + 1];
                }
            }
        }

        //imprime los numeros ordenados 
        System.out.println("Numeros ordenados:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        
            System.out.println("\n----------------------");
    }
        
        public void ejercicio_E(){
        //para generar los numeros
        int[] n = new int[100];
        for (int i = 0; i < n.length; i++) {
            n[i] = 100 - i; //100,99..
        }

        //mezcla los numeros
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] < n[j + 1]) {
                    //intercambio de numeros
                    n[j] = n[j] + n[j + 1];
                    n[j + 1] = n[j] - n[j + 1];
                    n[j] = n[j] - n[j + 1];
                }
            }
        }

        // imprime descendentemente
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("\n----------------------");
        }
        
        public void ejercicio_F(){
        //imprime los numeros del inicio
        System.out.println("1 2 3 4 5 6 7 8");

        // filas a,b,c con fichas negras
        System.out.println("A N N N N");
        System.out.println("B N N N N");
        System.out.println("C N N N N");

        // fila d,e vacias
        System.out.println("D");
        System.out.println("E");

        // filas f,g,h con fichas rojas
        System.out.println("F R R R R");
        System.out.println("G R R R R");
        System.out.println("H R R R R");
        
         System.out.println("\n----------------------");
        }
        
}




