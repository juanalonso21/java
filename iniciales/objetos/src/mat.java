import java.util.Scanner;
public class mat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       // prueba1(args);
        maxminNotas(args);
        maxminTemperaturas(args);
    }
    public static void prueba1(String[] args) {
        double aleatorio = Math.random()*30 +1;
        double aleatorio1 = Math.random();
        double valor = Math.sin( 90);
        System.out.println(valor);
        System.out.println(Math.sqrt(64));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.abs(-10));
        System.out.println(Math.round(10.6));
        System.out.println(Math.random());
        System.out.println((int)aleatorio + 60);
        double nota = Math.random()*10;
        System.out.println("nota:" + Math.round(nota*100)/100.00);
    }
    public static void maxminNotas(String[] args) {
        double nota = 0;
        double maximo = 0;
        double minimo = 10;
        for (int i =0; i<=10; i++){
            nota = Math.random()*10;
            System.out.println("nota:" + Math.round(nota*100)/100.00);
            if (nota > maximo) {
                maximo = nota;
            }
            if (nota < minimo) {
                minimo = nota;
            }
        }
        System.out.println("La nota minima es:"+ minimo);
        System.out.println("La nota maxima es:"+ maximo);
    }
    public static void maxminTemperaturas(String[] args) {
        double temperatura = 0;
        double maximo = 0;
        double minimo = 0;
        for (int i =0; i<=10; i++){
            temperatura = Math.random()*10;
            System.out.println("nota:" + Math.round(temperatura*100)/100.00);
            if (i == 0) {
                maximo = temperatura;
            }
            if (temperatura > maximo) {
                maximo = temperatura;
            }
            if (i == 0) {
                minimo = temperatura;
            }
            if (temperatura < minimo) {
                minimo = temperatura;
            }
        }
        System.out.println("La temperatura minima es:"+ minimo);
        System.out.println("La temperatura maxima es:"+ maximo);
    }
}
