import java.util.Scanner;
public class horas { //En programacion orientada a OBJETOS, VAMOS A CREAR OBJETOS CON EL OPERADOR NEW PERO SI LA CLASE ES ESTATICA NO SE PUEDE
    public static void main(String[] args) {  //El metodo main es estatico main es estatica
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce cuantas horas echaste: ");
        int horas = Integer.parseInt(s.nextLine());
        System.out.print("Introduce cuantas hora extras echaste: ");
        int extras = Integer.parseInt(s.nextLine());
        int dinero = horas * 12 + extras * 20;
        System.out.println("Tienes este dinero en horas:"+ dinero);
        s.close();
    }
    //SOBRE UNA CLASE ESTATICA TODOS SUS METODOS Y PROPIDADES LLEVAN EL PREFIJO STATIC Y NO SE PUEDEN CREAR OBJETOS CON EL METODO N
}
