package bucles;
import java.util.Scanner;

public class bucle {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el numero al que quieres llegar:");
        int inc = Integer.parseInt(s.nextLine()); 
        for (int i = 0; i <= inc; i++) {
            System.out.println(i); 
        }

    }
}
