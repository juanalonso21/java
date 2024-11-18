import java.util.Scanner;

public class copia {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce tu nombre: ");
    String nombre = s.nextLine();
    System.out.print("Introduce tu edad: ");
    int edad = Integer.parseInt(s.nextLine());
    System.out.print("Introduce tu ciudad: ");
    String ciudad = s.nextLine();
    System.out.print("Introduce tu provincia: ");
    String provincia = s.nextLine();
    System.out.println("Tu nombre es " + nombre + " , tu edad es" +" "+ edad + " tu ciudad es" +" "+ ciudad +" " + "tu provincia es" +" "+ provincia);
    
}
    }