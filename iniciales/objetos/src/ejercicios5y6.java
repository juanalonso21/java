import java.util.Scanner;

public class ejercicios5y6 {
    static Scanner s = new Scanner(System.in); 
    final static double PI = 3.14159265358979323846; 
    public static double area;

    public static void main(String[] args) {
        areaCuadrado();  
        volumenCono();
        areaRectangulo();
    }

    public static double areaRectangulo() {
        System.out.println("Introduce el largo del rectángulo:");
        double largo = s.nextDouble();  
        System.out.println("Introduce la altura del rectángulo:");
        double altura = s.nextDouble();  
        double areaRectangulo = largo * altura;
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        return areaRectangulo;
    }

    public static double volumenCono() {
        System.out.print("Introduce el radio: ");
        double radio = s.nextDouble();  
        System.out.print("Introduce la altura: ");
        double altura = s.nextDouble();  
        double volumen = (PI * radio * radio * altura) / 3;  
        System.out.println("El volumen del cono es: " + volumen);
        return volumen;
    }

    public static double areaCuadrado() {
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = s.nextDouble();
        double areaCuadrado = lado * lado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);
        return areaCuadrado;
    }
    public static void menu(){ //El nextline .charAt da el carcter en la posicion que le pongamos
        System.out.println("Menu principal");
        System.out.println("-------------");
        System.out.println("1. Area cuadrado");
        System.out.println("2. Area rectangulo");
        System.out.println("3. Area cono");
        int menuOpt = s.nextInt(); //Se pueden pedir las cosas con el next para que no coja  el espacio 
        switch (menuOpt) { //En los case no se pueden poner condiciones
            case "1":
                ;
                break;
    }
}
}


