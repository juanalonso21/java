package arrays;

public class apuntes2 {
    static String[] pruebaString = {"a", "b", "c", "d"};
    static int longitudArrayA = 10;
    static int longitudArrayB = 5;
    static int[][] arrayPrueba = new int[longitudArrayA][longitudArrayB];
    //Aqui un pequeño indice de metodos y lo que hace cada uno:
    //  Este primer metodo getIndex nos da el indice del parametro que le pasemos
    //  Este segundo metodo generacionNumeros nos genera numeros aleatorios en el array, genera numeros del 0 al 10, lo casteamos a int, si quisieramos decimales tendriamos que usar un double y la siguiente linea comentada
    public static void main(String[] args) {
        generacionNumeros();
    }
    public static int getIndex(String indice) {
        for (int i = 0; i < pruebaString.length; i++) {
            if (pruebaString[i].equalsIgnoreCase(indice)) {
                return i; 
            }
        }
        return -1; 
    }
    public static void generacionNumeros() {
        for (int i = 0; i < longitudArrayA; i++) {
            for (int j = 0; j < longitudArrayB; j++) {
                arrayPrueba[i][j] = (int) (Math.random() * 11);
            }
        }
        Math.round(max * 100.0) / 100.0);
    
    }
}
