
package damas;

import java.util.Scanner;

public class Damas {

  private Tablero tablero;
    private String turno; // "R" o "B"

    public Damas(){
        tablero = new Tablero();
        turno = "R"; 
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        
 while (seguir) {
            tablero.mostrar();
            System.out.println("Turno de: " + (turno.equals("R") ? "Rojo (R)" : "Negro (B)"));
            System.out.print("Fila origen: ");
            int fo = sc.nextInt();
            System.out.print("Columna origen: ");
            int co = sc.nextInt();
            System.out.print("Fila destino: ");
            int fd = sc.nextInt();
            System.out.print("Columna destino: ");
            int cd = sc.nextInt();

            boolean movio = tablero.moverFicha(fo, co, fd, cd, turno);
            if (movio) {
                // Cambiar turno
                turno = turno.equals("R") ? "B" : "R";
            }

            System.out.print("¿Desea continuar? (s/n): ");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("n")) {
                seguir = false;
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        Damas juego = new Damas();
        juego.iniciar();
    }
}

