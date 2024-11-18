import java.util.Scanner;

public class notas {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        nota();
    }

    public static void nota() {
        System.out.println("Introduce tu nombre:");
        String nombre = s.nextLine();
        String condicion = "S";
        String tipoNota = "s";
        while (!condicion.equals("N")) {
            System.out.println("Introduce el módulo:");
            String modulo = s.nextLine();
            
            System.out.println("Introduce tu nota:");
            double nota = s.nextDouble();
            s.nextLine();
            if (nota < 5){
                 tipoNota = "Suspenso";
            }
            else if (nota >= 5 && nota <= 6){
                tipoNota = "Aprobado";
            } 
            else if (nota >= 6 && nota <= 7){
                tipoNota = "Notable";
            }
            else if (nota >= 7 && nota <=   9){
                tipoNota = "Sobresaliente";
            }
            else if (nota == 10){
                tipoNota = "Matricula";
            }
            else {
                System.out.println("La nota introducida no es correcta.");
            }
            System.out.println(nombre + " tiene un " + nota + " " +"lo que es un " + tipoNota + " en el módulo de " + modulo );
            
            System.out.println("¿Deseas continuar?");
            condicion = s.nextLine().toUpperCase();
        }
    }
}

