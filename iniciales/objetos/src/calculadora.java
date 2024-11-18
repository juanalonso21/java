import java.util.Scanner;

public class calculadora {
    static Scanner sc = new Scanner(System.in);
    static int numeroEntradas;
    static String diaSemana;
    static char tarjetaCine;
    static double precioTotal;
    static double descuento;
    static int entradasIndividuales;
    static int parejas;

    public static void main(String[] args) {
        entradaDatos();
        calcularPrecio();
        salidaDatos();
    }

    public static void entradaDatos() {
        System.out.println("Venta de entradas CineCampa");
        System.out.print("Numero de entradas: ");
        numeroEntradas = sc.nextInt();
        sc.nextLine();  // Consumir el salto de línea
        System.out.print("Dia de la semana: ");
        diaSemana = sc.nextLine().toLowerCase();
        System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
        tarjetaCine = sc.nextLine().toLowerCase().charAt(0);
    }

    public static void calcularPrecio() {
        double precioBase;
        
        // Determinar el precio base por entrada en función del día
        if (diaSemana.equals("miércoles")) {
            precioBase = 5.0;
            entradasIndividuales = numeroEntradas;
            precioTotal = entradasIndividuales * precioBase;
        } else if (diaSemana.equals("jueves")) {
            parejas = numeroEntradas / 2;
            entradasIndividuales = numeroEntradas % 2;
            precioTotal = (parejas * 11.0) + (entradasIndividuales * 8.0);
        } else {
            precioBase = 8.0;
            entradasIndividuales = numeroEntradas;
            precioTotal = entradasIndividuales * precioBase;
        }

        // Aplicar descuento si tiene la tarjeta CineCampa
        descuento = 0;
        if (tarjetaCine == 's') {
            descuento = precioTotal * 0.1; // 10% de descuento
            precioTotal -= descuento;
        }
    }

    public static void salidaDatos() {
        System.out.println("\nAquí tiene sus entradas. Gracias por su compra.");
        
        if (diaSemana.equals("jueves") && parejas > 0) {
            System.out.printf("Entradas de pareja: %d%n", parejas);
            System.out.printf("Precio por entrada de pareja: %.2f €%n", 11.0);
        }
        
        if (entradasIndividuales > 0) {
            System.out.printf("Entradas individuales: %d%n", entradasIndividuales);
            System.out.printf("Precio por entrada individual: %.2f €%n", diaSemana.equals("miércoles") ? 5.0 : 8.0);
        }
        
        System.out.printf("Total: %.2f €%n", precioTotal + descuento);
        System.out.printf("Descuento: %.2f €%n", descuento);
        System.out.printf("A pagar: %.2f €%n", precioTotal);
    }
}
