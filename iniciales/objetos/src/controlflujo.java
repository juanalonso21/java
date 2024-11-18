import java.util.Scanner;

public class controlflujo {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el dia de la semana:");
        String dia = s.nextLine();
        switch (dia) {
            case "lunes":
                System.out.println("Sostenibilidad");
                break;
                case "martes":
                System.out.println("Entornos de desarrollo");
                break;
                case "miercoles":
                System.out.println("IPP");
                break;
                case "jueves":
                System.out.println("Base de datos");
                break;
                case "viernes":
                System.out.println("Lenguaje de marcas");
                break;
                case "sabado":
                System.out.println("No tienes clase");
                break;
                case "domingo":
                System.out.println("No tienes clase");
                break;
            default:
            System.out.println("Introduce bien el dia de la semana para saber que te toca a primera hora");
                break;
        }
    }
}