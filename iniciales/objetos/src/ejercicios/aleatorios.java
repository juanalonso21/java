package ejercicios;

import java.util.Scanner;

public class aleatorios {
    static Scanner sc = new Scanner(System.in);

    // ejercios 2 y que se analice cuanto sale cada 1//ejrecicio 6 y 5, 7, 9, 11,
    public static void main(String[] args) throws InterruptedException {
        //ejercicio1(args);
        // ejercicio6(args);
        // ejercicio5(args);
        // ejercicio9(args);
        // ejercicio11(args);
         ejercicio12(args);
    }

    public static void ejercicio1(String[] args) {
        int j = 0;
        int q = 0;
        String cartaMax = "a";
        String cartaMin = "a";
        int cartaMasAlta = 0;
        int cartaMasBaja = 0;
        for (int i = 0; i <= 10; i++) {
            String palo = "";
            String carta = "";
            int numeroPalo = (int) (Math.random() * 4) + 1;
            switch (numeroPalo) {
                case 1:
                    palo = "picas";
                    break;
                case 2:
                    palo = "corazones";
                    break;
                case 3:
                    palo = "diamantes";
                    break;
                case 4:
                    palo = "tréboles";
            }
            int numeroCarta = (int) (Math.random() * 13) + 1;
            switch (numeroCarta) {
                case 1:
                    carta = "AS";
                    break;
                case 11:
                    carta = "J";
                    j++;
                    break;
                case 12:
                    carta = "Q";
                    q++;
                    break;
                case 13:
                    carta = "K";
                    break;
                default:
                    carta = String.valueOf(numeroCarta);
            }
            String cartaActual = carta + " de " + palo;
            if (i == 0) {
                cartaMax = cartaActual;
                cartaMin = cartaActual;
                cartaMasAlta = numeroCarta;
                cartaMasBaja = numeroCarta;
            }
            if (numeroCarta > cartaMasAlta) {
                cartaMasAlta = numeroCarta;
                cartaMax = cartaActual;
            }
            if (numeroCarta < cartaMasBaja) {
                cartaMasBaja = numeroCarta;
                cartaMin = cartaActual;
            }

           if(numeroCarta == 12 || numeroCarta ==11){
            System.out.println(cartaActual);
        }
        }
        System.out.println("La carta mas alta ha sido:" + cartaMax);
        System.out.println("La carta mas baja ha sido:" + cartaMin);
        System.out.println("La q ha salido" + q + "veces");
        System.out.println("La j ha salido" + j + "veces");

    }

    public static void ejercicio6(String[] args) {
        int oportunidades = 5;
        int numeroIntroducido;
        boolean acertado = false;
        int numero = (int) (Math.random() * 100) + 1;
        System.out.println("Tienes que adivinar un numero del 1 al 100. Tienes 5 oportunidades.");
        while (!acertado && (oportunidades > 0)) {
            System.out.print("Introduce un número: ");
            numeroIntroducido = Integer.parseInt(sc.nextLine());
            oportunidades--;

            if (numeroIntroducido > numero && oportunidades > 0) {
                System.out.println("El número es menor que " + numeroIntroducido);
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            } else if (numeroIntroducido < numero && oportunidades > 0) {
                System.out.println("El número es mayor que " + numeroIntroducido);
                System.out.println("Te quedan " + oportunidades + " oportunidades.");
            } else if (numeroIntroducido == numero) {
                acertado = true;
                System.out.println("¡Enhorabuena! ¡has acertado!");
            }
        }

        if (!acertado) {
            System.out.println("Lo siento, no has acertado, el número era el " + numero);
        }
    }

    public static void ejercicio5(String[] args) {
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int numero = 0;
        for (int i = 0; i < 50; i++) {
            numero = (int) (Math.random() * 100) + 100;
            System.out.print(numero + " ");
            suma += numero;
            if (numero < minimo) {
                minimo = numero;
            }
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Media: " + suma / 50);

    }

    public static void ejercicio9(String[] args) {
        int numero = 0;
        int cuentaNumeros = 0;
        while (numero != 24) {
            numero = (int) (Math.random() * 100) + 1;
            if (numero % 2 == 0) {
                System.out.print(numero + "\n");
                cuentaNumeros++;
            }
        }
        System.out.println("\nSe han generado " + cuentaNumeros + " números.");

    }

    public static void ejercicio11(String[] args) {
        int nota;
        int suspensos = 0;
        int suficientes = 0;
        int notables = 0;
        int sobresalientes = 0;
        for (int i = 0; i < 20; i++) {
            nota = (int) (Math.random() * 10);
            switch (nota) {
                case 0:
                System.out.println(nota);    
                System.out.println("suspenso ");
                    suspensos++;
                    break;
                case 1:
                System.out.println(nota);     
                System.out.println("suspenso ");
                    suspensos++;
                    break;
                case 2:
                System.out.println(nota);     
                System.out.println("suspenso ");
                    suspensos++;
                    break;
                case 3:
                System.out.println(nota);    
                System.out.println("suspenso ");
                    suspensos++;
                    break;
                case 4:
                System.out.println(nota);     
                System.out.println("suspenso ");
                    suspensos++;
                    break;
                case 5:
                System.out.println(nota);     
                System.out.println("suficiente");
                    suficientes++;
                    break;
                case 6:
                System.out.println(nota);     
                System.out.println("suficiente ");
                    suficientes++;
                    break;
                case 7:
                System.out.println(nota);         
                System.out.println("notable ");
                    notables++;
                    break;
                case 8:
                System.out.println(nota);        
                System.out.println("notable ");
                    notables++;
                    break;
                case 9:
                System.out.println(nota);        
                System.out.println("sobresaliente ");
                    sobresalientes++;
                    break;
                case 10:
                System.out.println(nota);        
                System.out.println("sobresaliente ");
                    sobresalientes++;
                    break;
            }
        }
        System.out.println("Nº de suspensos: " + suspensos);
        System.out.println("Nº de suficientes: " + suficientes);
        System.out.println("Nº de notables: " + notables);
        System.out.println("Nº de sobresalientes: " + sobresalientes);

    }

    public static void ejercicio12(String[] args) throws InterruptedException {
        int linea = 0;
        System.out.print("\033[32m"); // Pinta en verde

        for (int i = 0; i < 800000000; i++) {
            System.out.print((char) (Math.random() * (126 - 32 + 1) + 32));
            if (linea++ == 60) {
                linea = 0;
                System.out.println();
            }
        }

        System.out.print("\033[0m");
    }
}
