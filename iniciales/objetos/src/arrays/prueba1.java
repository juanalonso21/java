package arrays;
import java.util.Scanner;
public class prueba1 {
    static Scanner sc = new Scanner(System.in);
    static String[] nombre = new String[10];
    public static void main(String[] args) {
        pruebaNotas(args);    
        }
    public static void prueba(String[] args) {
        int nota = 9;
        int[] notas = new int[10];
        notas[0] = 3;
        notas[1] = 4;
        notas[2] = 7;
        for(int i=0; i<=10; i++){
            System.out.println("La nota del alumno " + (i +1) +" "+"es" +" "+notas[i]);
        }
        int[][] notas2 = new int[4][5];
        notas2[0][0] = 7;
        System.out.println(notas2[0][0]);
    }
    public static void notasTeclado(String[] args) {
        int[] notas = new int[10];
        int i=0;
        for(i=0; i<=9; i++){
            System.out.println("Introduce la nota " + i + ":");
            notas[i] = sc.nextInt();
        }
        for(i=0; i<=9; i++){
            System.out.println("La nota del alumno " + i+" "+"es" +" "+notas[i]);
        }
    }
    public static void pruebaNotas(String[] args) {
        int[] notas = new int[10];
        int max =notas[0];
        int min =notas[0];
        for(int i=0; i<=9; i++){
            System.out.println("Introduce tu nombre:");
            nombre[i] = sc.nextLine();        
        }
        for(int i=0; i<=9; i++){
            System.out.println("Introduce la nota " + nombre[i] + ":");
            notas[i] = sc.nextInt();        
        }
    
    for(int i=0; i<=9; i++){
        if()
    }
}
}
