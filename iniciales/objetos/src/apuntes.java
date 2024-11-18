import java.util.Scanner; //Las tablas son las clases en orientacion de objetos
public class apuntes { //Se pueden declarar varibles en la clase para poder utilizarlo en todos los metodos
    //public static int edad1; y para usarlo en una clase la llamamos como clase.varia  ble
    //Para el proximo dia ejercicio 5 y 6 area rectangulo y subirlo a youtube como ejercicio
   public static final double pi = 3.1415; //Propiedad es una variable a nivel de clase, en este caso es una constante
   //La variable de entrada en este caso s es recomendable declararla a nivel de clase si la voy a usar en varios metodos
   //Se puede hacer s.nextint() y te quitas el parseint, se puede usar con otro tipo de datos
   //IMPORTATE Declaramos los metodos con el return al final para almacenar el valor al final de el metodo declaramos a nivel de clase el mismo luego en el metodo main lo ponemos igual al metodo
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
}


