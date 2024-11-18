import java.util.Scanner;

public class nota {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = Double.parseDouble(s.nextLine());
        System.out.print("Introduce la nota deseada a final de año: ");
        double notadeseada = Double.parseDouble(s.nextLine());
         nota1 = nota1 * 0.6;
        double nota2 = (notadeseada - nota1) / 0.4;
        System.out.println("Necesitas sacar un " + nota2 + " en el segundo examen para tener un " + notadeseada + " a final de año.");
        s.close();
    }
}
