import java.util.Scanner;
public class ejercicio26 {
    static Scanner sc = new Scanner(System.in);
    static int numeroEntradas;
    static String diaSemana;
    static char tarjetaCine;
    static int entradasPares;
    static int entradasSobrantes;
    static int precioEntrada;

    public static void main(String[] args) {
        entradaDatos();
        jueves();
        salidaDatos();
    }

    public static void entradaDatos() {
        System.out.println("Venta de entradas CineCampa");
        System.out.print("Numero de entradas: ");
        numeroEntradas = sc.nextInt();
        sc.nextLine();  
        System.out.print("Dia de la semana: ");
        diaSemana = sc.nextLine();
        System.out.print("¿Tienes tarjeta CineCampa? (s/n): ");
        tarjetaCine = sc.nextLine().toUpperCase().charAt(0);
    }
    public static void diaSemana() {
        switch (diaSemana) {
            case "jueves":

                break;
        
            default:
                precioEntrada = 8;
                break;
        }
    }
    public static void jueves() {
        if (diaSemana.equalsIgnoreCase("jueves")) {
            entradasPares = numeroEntradas / 2;
            entradasSobrantes = numeroEntradas % 2;  
            precioEntrada = entradasPares
        } 
    }

    public static void salidaDatos() {
        System.out.println("Numero de entradas pares: " + entradasPares);
        System.out.println("Numero de entradas sobrantes: " + entradasSobrantes);
    }
}
