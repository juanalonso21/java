import java.util.Scanner;
public class volumen {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        final double PI = 3.14159265358979323846;   
        System.out.print("Introduce el radio: ");
        int radio = Integer.parseInt(s.nextLine());
        radio = radio * radio;
        System.out.print("Introduce la altura: ");
        int h = Integer.parseInt(s.nextLine());
        double volumen = PI * radio * h / 3;
        System.out.println(volumen);
        s.close();
}
}