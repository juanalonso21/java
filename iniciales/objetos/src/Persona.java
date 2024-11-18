public class Persona {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce el nombre de la primera persona:");
        String nombre1 = s.nextLine(); 
        System.out.println("Introduce la edad de "+ nombre1 + ":");
        int edad1 = Integer.parseInt(s.nextLine());
        System.out.println("Introduce el nombre de la segunda persona:");
        String nombre2 = s.nextLine(); 
        System.out.println("Introduce la edad de "+ nombre2 + ":");
        int edad2 = Integer.parseInt(s.nextLine());
        compararEdades(edad1, edad2, nombre1, nombre2); 
    }

    public static void compararEdades(int edad1, int edad2, String nombre1, String nombre2) { 
        if (edad1 > edad2) {
            System.out.println(nombre1 + " es mayor.");
        } else if (edad2 > edad1) {
            System.out.println(nombre2 + " es mayor.");
        } else {
            System.out.println(nombre1 + " y " + nombre2 + " tienen la misma edad.");
        }

    }
    s.close();

}
