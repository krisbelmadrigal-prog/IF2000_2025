package damas;

public class Tablero {
    

 private Ficha[][] tablero = new Ficha[8][8];

    public Tablero() {
        inicializar();
    }

    // Coloca las fichas rojas y negras al inicio
    private void inicializar() {
        // Fichas negras (arriba)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    tablero[i][j] = new Ficha("B");
                }
            }
        }

// Fichas rojas (abajo)
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    tablero[i][j] = new Ficha("R");
                }
            }
        }
    }

    // Muestra el tablero actual
    public void mostrar() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

// Verifica si un movimiento es válido
    public boolean moverFicha(int filaOrigen, int colOrigen, int filaDestino, int colDestino, String turno) {
        // Validar coordenadas
        if (!estaDentro(filaOrigen, colOrigen) || !estaDentro(filaDestino, colDestino)) {
            System.out.println("Coordenadas fuera del tablero.");
            return false;
        }

        Ficha ficha = tablero[filaOrigen][colOrigen];
        if (ficha == null) {
            System.out.println("No hay ficha en la posición de origen.");
            return false;
        }

if (!ficha.getColor().equals(turno)) {
            System.out.println("No puedes mover una ficha del otro color.");
            return false;
        }

        if (tablero[filaDestino][colDestino] != null) {
            System.out.println("La casilla destino está ocupada.");
            return false;
        }
 // Validar movimiento diagonal de una casilla
        int deltaFila = filaDestino - filaOrigen;
        int deltaCol = Math.abs(colDestino - colOrigen);

        if (deltaCol != 1) {
            System.out.println("El movimiento debe ser diagonal de una casilla.");
            return false;
        }

        // Movimiento según color
        if (turno.equals("R") && deltaFila != 1) {
            System.out.println("Las fichas rojas se mueven hacia abajo.");
            return false;
        }
if (turno.equals("B") && deltaFila != -1) {
            System.out.println("Las fichas negras se mueven hacia arriba.");
            return false;
        }

        // Si todo es válido, mover ficha
        tablero[filaDestino][colDestino] = ficha;
        tablero[filaOrigen][colOrigen] = null;
        return true;
    }

    private boolean estaDentro(int fila, int col) {
        return fila >= 0 && fila < 8 && col >= 0 && col < 8;
    }
}

















