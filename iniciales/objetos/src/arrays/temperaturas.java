package arrays;
import java.util.Scanner;
public class temperaturas {
    static Scanner sc = new Scanner(System.in);
    static String[] sitio = new String[10];
    static double[] temperatura = new double[10]; 
    static double min = 0; 
    static double max = 0; 
    static double suma = 0; 
    static double media = 0;
    public static void main(String[] args) {
        pedirDatos(args);
        generarTemperatura(args);
        estadistica(args);
        imprimirEstadisticas(args);    }
    public static void pedirDatos(String[] args) {
        for(int i=0;i<=9;i++){
        System.out.println("Introduce el nombre de la ciudad:"+ (i +1));
        sitio[i] = sc.nextLine();
    }
    }
    public static void generarTemperatura(String[] args) {
        for(int i=0;i<=9;i++){
        temperatura[i] = (double) (Math.random());
        } 
    }
    public static void estadistica(String[] args) {
        for(int i=0;i<=9;i++){
            if(i==0){
                max = temperatura[i];
                min = temperatura[i];
            }
            if(temperatura[i] > max){
                max = temperatura[i];
            }
            if(temperatura[i] < min){
                min = temperatura[i];
            }
            suma = suma + temperatura[i];
        } 
        media = suma / 10;
    }
    public static void imprimirEstadisticas(String[] args) {
        System.out.println("-------------ESTADISTICAS-------------");
        for(int i=0;i<=9;i++){
            System.out.println("La temperatura de " + sitio[i] + " "+ "es"+ " " + Math.round(temperatura[i] * 100.0) / 100.0);
        };
        System.out.println("La temperatura maxima es:" + Math.round(max * 100.0) / 100.0);
        System.out.println("La temperatura minima es:" + Math.round(min * 100.0) / 100.0);
        System.out.println("La temperatura media es:" + Math.round(media * 100.0) / 100.0);
 
    }
}
