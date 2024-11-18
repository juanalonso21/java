public class App {  //Clase principal de un proyecto Java por convenio
    //metodo o funcion main se le debe llamar metodo, el main comineza la ejecucion de la clase
    //Una clase tendra propiedades o varibles y las propiedades van a tener metodos
    public static void main(String[] args) throws Exception { //una clase contiene propidades o metodos
        //Creacion de varibles dentro de un metodo
        int monedas = 5; //Declaracion de variables o llamado en java propiedades
        //Variable dentro de metodo se llaman variables de metodo, si esta a nivel de metodo es propiedad
        System.out.println("Hello, World!"); //Mensaje de bienvenida por pantalla
        System.out.println("\033[34m Me llamo Juan A. Pérez y sere un gran progamador");
        //Se usa el printf para imprimir varibles o propiedades se puede poner %.3f para decirle que queremos solo 3 decimales este es el uso del %
   double comision = 15.5;
   System.out.printf("El valor es %.5f %n", comision); //%n es un salto de linea al final de la linea
   System.out.printf("El valor es %10.5f %n", comision); //El 10 es el ancho y segun el menos o el mas va para un lado o la otro
   System.out.printf("El valor es %-10.5f %n", comision);
    System.out.printf("%20s %10s %10s%n", "Producto", "Cantidad", "Precio");
    System.out.printf("%20s %10s %10s%n", "Portatil", 10, 1300, 45);
      //  int valor = 20; //Esto lo que hace es asignarle un valor
       // if (valor = 20){ //Se usa el == para comparar, porque compara expresiones es de decir expresion1 == expresion2
            //System.out.println(este valor es IGUAL a 20); 
      //  }
        //Siempre hay que asignar valores a las variables porque las operaciones con NULL dan error siempre inicializar las variables
    //Las variables no pueden empezar por un numero
    //Siempre se usa el guion bajo ya que el alto es el menos
    String datos = "Buenas tardes";
    System.out.println(datos);
    String nombre = "Juan";
    String apellido = "perez";
    String nombrecompleto = "0";
    nombrecompleto = nombre + apellido;
    System.out.println("Tu nombre completo es =" + nombrecompleto);
    nombre.concat(apellido);
    System.out.println(nombre);
    System.out.println(("Te llamas: ").concat(nombrecompleto));
    //El uso de char es para un solo caracter
}
}
class Coche {


}