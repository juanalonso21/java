package bucles;
import java.util.Scanner;

public class ejercicio15 {
    static Scanner sc = new Scanner(System.in);
    static double numero = 0;
    static double base = 0;

    public static void main(String[] args) {
        introducirDatos(args);
        calculo(args);
    }
    public static void introducirDatos(String[] args) {
        System.out.println("Introduce el numero:");
        numero = sc.nextDouble();
        System.out.println("Introduce la base:");
        base = sc.nextDouble();
    }
        public static void potencia(String[] args) {
            for (int i = 0; i>=base; i++){
                System.out.println(calculo());
            }

        }
    }
    public static double calculo(String[] args) {
         double numero2 = numero;
        for(int i = 1; i <= base; i++){
            numero2 = numero2 * numero;
            System.out.println(numero2);
            return numero2;
        }
    }
}
