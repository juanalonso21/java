    import java.util.Scanner;
public class ejercicio24 {
    static Scanner sc = new Scanner(System.in);
    static double juniorBase = 950;
    static double seniorBase = 1200;
    static double jefeBase = 1600;
    static double viajeCliente = 30;
    static int puesto;
    static int visitarClientes;
    static char estadoCivil;
    static double sueldoBase = 0;
    static double irpf = 0;
    public static void main(String[] args) {
        ejercicio24.menu();
        ejercicio24.sueldo();
    }
    public static void menu() {
        System.out.println("1. Programador junior");
        System.out.println("2. Programador senior");
        System.out.println("3. Jefe de proyecto");
        System.out.println("Introduce tu puesto (1 - 3)");
        puesto = sc.nextInt();
        System.out.println("Cuantos dias has estado de viaje visitando clientes:");
        visitarClientes = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Introduzca su estado civil (Soltero o Casado):");
        estadoCivil = sc.nextLine().toUpperCase().charAt(0);

        while (estadoCivil != 'S' && estadoCivil != 'C') {
            System.out.println("El estado civil no es correcto. Vuelva a introducirlo (S para Soltero, C para Casado):");
            estadoCivil = sc.nextLine().toUpperCase().charAt(0);
        }
        }
    public static void sueldo() {
        double dietas = visitarClientes * viajeCliente;
        if (puesto == 1) {
            sueldoBase = juniorBase;
         }
         else if (puesto == 2) {
             sueldoBase = seniorBase;
         }
         else if (puesto == 3) {
             sueldoBase = jefeBase;
         }
         double sueldoBruto = dietas + sueldoBase;
         if (estadoCivil == 'C') {
            irpf = sueldoBruto * 0.15;
         }
         else if (estadoCivil == 'S') {
            irpf = sueldoBruto * 0.20;
         }
         double sueldoNeto = sueldoBruto - irpf;

         System.out.println("Sueldo base: " + sueldoBase);
         System.out.println("Dietas: " + dietas);
         System.out.println("Sueldo bruto: " + sueldoBruto);
         System.out.println("IRPF:" + irpf);
         System.out.println("Sueldo neto:" + sueldoNeto);
    }
}
