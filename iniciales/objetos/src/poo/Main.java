package poo;
import poo.Vehiculo;
public class Main {
    public static void main(String[] args) {
        //dentro de la programacion orientada a objetos la clase es la tabla en elquivalencia sea se es la estructura en cambio los objetos son los registros
        //los tipos de datos:
        //public: Se ve en todas las clases
        //private: NO se ve ni por clientela que es lo que hacemos abajo ni por herencia
        //protected: En este caso por clientela es privada pero se hace publica por herencia
        // no se deben modificar las propiedad desde el exterior, principio de responsabilidad
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();
        // v1.modelo = "207";
        // v1.marca = "Peugot";
        v1.setMarca("Audi");
        v2.setMarca("Peugot");
        v1.setModelo("A3");
        v1.getMarca();
        v2.getModelo();
        // System.out.println("Vehiculo 1 es un " + v1.getMarca()+ " "+ v1.getModelo());
        v1.visualizacionClase();
    }
}
