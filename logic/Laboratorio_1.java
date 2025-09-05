package logic;

/**
 *
 * @author krisb
 */
public class Laboratorio_1 {
    public void ejercicio_1(){
   int n = 7;
    if (n%2 == 0){
        System.out.println(n+" es un numero par.");
    }else{
        System.out.println(n+" es un numero impar.");
    }
    System.out.println("\n----------------------");
    }
    
    public void ejercicio_2(){
        int n = -16;
        int valorAbsoluto;
        
        if(n < 0){
            valorAbsoluto = -n;
        }else{
            valorAbsoluto = n;
        }
        System.out.println("El valor absoluto de " +n+ " es: " +valorAbsoluto);
        System.out.println("\n----------------------");
        }
    
    public void ejercicio_3(){
        int suma = 0;
        System.out.println("Serie de numeros: ");
        for (int i = 3; i <= 99; i+=3) {
            System.out.print(i + " ");
            suma += i;
        }
        System.out.println("\nLa suma de la serie de numeros es: " + suma);
        System.out.println("\n----------------------");
        }
    
    public void ejercicio_4(){
        int a = 23;
        int b = 8;
        int c = 15;

        int menor, medio, mayor;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }

        System.out.println("Numeros en orden ascendente: " +
                           menor + ", " + medio + ", " + mayor);
        System.out.println("\n----------------------");
    }
    
    public void ejercicio_5(){
        int n1 = 10;
        int n2 = 5;
        
        int resultado;
        
        if (n1 == n2){
            resultado = n1 * n2;
            System.out.println("Son iguales, se deben multiplicar: " + resultado);
        }else if (n1 > n2){
            resultado = n1 - n2;
            System.out.println("El primer numero es mayor, se restan: " + resultado);
        } else{
            resultado = n1 + n2;
            System.out.println("El primer numero es menor, se suman: " + resultado);
            
        }
        System.out.println("\n----------------------");
    }
    
    public void ejercicio_6() {
        int[] notas = {7, 5, 10, 8, -1};
        boolean nota = false;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == -1) {
                break;
            }
            if (notas[i] == 10) {
                nota = true;
            }
        }

        if (nota) {
            System.out.println("Si hay al menos una nota con 10.");
        } else {
            System.out.println("No hay ninguna nota con 10.");
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_7() {
        int edad = 20;
        char sexo = 'F';
        int pulsaciones = 0;

        if (sexo == 'F') {
            pulsaciones = (220 - edad) / 10;
        } else if (sexo == 'M') {
            pulsaciones = (210 - edad) / 10;
        }

        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Numero de pulsaciones cada 10 segundos: " + pulsaciones);
        System.out.println("\n----------------------");
    }

    public void ejercicio_8() {
        double salario = 500000;
        int antiguedad = 8;
        double utilidad = 0;

        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * 0.15;
        } else if (antiguedad >= 10) {
            utilidad = salario * 0.20;
        }

        System.out.println("Salario mensual: " + salario);
        System.out.println("Anos en la empresa: " + antiguedad);
        System.out.println("La utilidad anual que recibe es: " + utilidad);
        System.out.println("\n----------------------");
    }

    public void ejercicio_9() {
        int n = 17;
        boolean nPrimo = true;

        if (n <= 1) {
            nPrimo = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    nPrimo = false;
                    break;
                }
            }
        }

        if (nPrimo) {
            System.out.println(n + " es un numero primo.");
        } else {
            System.out.println(n + " no es un numero primo.");
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_10() {
        int cantidad = 8;
        double precioUnitario = 11000;
        double totalSinDescuento, descuento = 0, totalPagar;

        totalSinDescuento = cantidad * precioUnitario;

        if (cantidad < 5) {
            descuento = totalSinDescuento * 0.10;
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = totalSinDescuento * 0.20;
        } else if (cantidad >= 10) {
            descuento = totalSinDescuento * 0.40;
        }

        totalPagar = totalSinDescuento - descuento;

        System.out.println("Cantidad de computadoras: " + cantidad);
        System.out.println("Precio total sin descuento: " + totalSinDescuento);
        System.out.println("Monto de descuento: " + descuento);
        System.out.println("Total a pagar: " + totalPagar);
        System.out.println("\n----------------------");
    }

    public void ejercicio_11() {
        int N = 20;

        System.out.println("Numeros primos entre 2 y " + N + ":");

        for (int numero = 2; numero <= N; numero++) {
            boolean numPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    numPrimo = false;
                    break;
                }
            }

            if (numPrimo) {
                System.out.print(numero + " ");
            }
        }
        System.out.println("\n----------------------");
    }

    public void ejercicio_12() {
        double base = 8;
        double altura = 5;
        double area;

        area = (base * altura) / 2;

        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area del triangulo: " + area);
        System.out.println("\n----------------------");
    }
}


    
    


   
  
