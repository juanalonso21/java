package arrays;

import java.util.Scanner;

public class notas {
    static int ALUMNOS = 5;
    static int ASIGNATURAS = 4;
    static String[] alumnos = {"Jose", "Ana", "Maria", "Luis", "Noelia"};
    static String[] modulos = {"PROG", "Redes", "Base de datos", "Desarrollo servidor"};
    static int[][] notas = new int[ALUMNOS][ASIGNATURAS];
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // getIndexModulo();
         lecturaNotas();
        imprimirNotas();
    }
    // public static void getIndexModulo() {
    //     System.out.println("Introduce el numero del modulo que quieres saber el numero");
    //     String modulo = sc.nextLine();
    //     int temporalModulo = -1;
    //     int i =0;
    //     while (temporalModulo == -1) {
    //         if (modulos[i].equals(modulo)) {
    //             temporalModulo = i;
    //             break;
    //         }
    //         i++;
    //     }
    //     System.out.println(temporalModulo);
    // }
    public static int getIndexModulo(String modulo) {
        for (int i = 0; i < modulos.length; i++) {
            if (modulos[i].equalsIgnoreCase(modulo)) {
                return i; 
            }
        }
        return -1; 
    }
    public static int getIndexAlumno(String alumno) {
        for (int i = 0; i < modulos.length; i++) {
            if (alumnos[i].equalsIgnoreCase(alumno)) {
                return i; 
            }
        }
        return -1; 
    }
    public static void lecturaNotas() {
        for (int i = 0; i < ALUMNOS; i++) {
            // System.out.println("Nota de " + alumnos[i] + ":");
            for (int j = 0; j < ASIGNATURAS; j++) {
                // System.out.println("    - " + modulos[j] + ": ");
                notas[i][j] = (int) (Math.random() * 11);
            }
        }
    
    }
    public static String[][] quienAprueba() {
        //array Nombres aprobados
        String[][] aprobados = new String[ASIGNATURAS][]; 
        int[] posicion = new int[ASIGNATURAS]; 
        for (int j = 0; j < ASIGNATURAS; j++) {
            int aprobadosContador = 0;
            for (int i = 0; i < ALUMNOS; i++) {
                if (notas[i][j] >= 5) {
                    aprobadosContador++;
                }
            }
            aprobados[j] = new String[aprobadosContador];
        }
            for (int i = 0; i < ALUMNOS; i++) {
            for (int j = 0; j < ASIGNATURAS; j++) {
                if (notas[i][j] >= 5) {
                    aprobados[j][posicion[j]] = alumnos[i];
                    posicion[j]++;
                }
            }
        }
        return aprobados;
    }
    public static void modulosAprueba(String persona) {
        int indiceAlumno = getIndexAlumno(persona); 
        String[] aprobados = new String[ASIGNATURAS]; 
        int indice = 0; 

        if (indiceAlumno != -1) { 
            for (int i = 0; i < ASIGNATURAS; i++) {
                if (notas[indiceAlumno][i] >= 5) { 
                    aprobados[indice] = modulos[i]; 
                    indice++;
                }
            }
        }

    }
    public static String[] quienPromociona() {
        //Array de nombres que les haya quedado solo 1
        String[] promocionados = new String[ALUMNOS];
        for(int i = 0; i < ALUMNOS; i++){
            int contador = 0;
            for(int j = 0; j < ASIGNATURAS; j++){
                if(notas[i][j] < 5){
                    contador++;
                }

            }
            if(contador <=1){
                promocionados[i] = alumnos[i];
            }
        }
        return promocionados;
    }
    public static void listadoModSuspensos(String[] args) {
    int[] contadorSuspensos = new int[ASIGNATURAS + 1];
    for (int i = 0; i < ALUMNOS; i++) {
        int suspensos = 0;
        for (int j = 0; j < ASIGNATURAS; j++) {
            if (notas[i][j] < 5) {
                suspensos++;
            }
        }
        contadorSuspensos[suspensos]++;
    }
    System.out.println("Número de personas que han suspendido cierto número de módulos:");
    for (int i = 0; i <= ASIGNATURAS; i++) {
        System.out.println("Número de personas que han suspendido " + i + " módulos: " + contadorSuspensos[i]);
    }
    }
    public static String notaMayorModulo(String modulo) {
        int indiceModulo = getIndexModulo(modulo);
        int maxNota = notas[0][indiceModulo];
        String alumnoMax = alumnos[0];
    
        for (int i = 1; i < ALUMNOS; i++) {
            if (notas[i][indiceModulo] > maxNota) {
                maxNota = notas[i][indiceModulo];
                alumnoMax = alumnos[i];
            }
        }
        return alumnoMax;
    }
    public static String notaMayorPersona(String persona) {
        int indiceAlumno = getIndexAlumno(persona);
        int max = 0;
        String pmax = "";
        for (int i = 0; i < ASIGNATURAS; i++) {
            if(notas[i][indiceAlumno] > max){
                max = notas[i][indiceAlumno];
                pmax = modulos[i];
            }
            if(i==0){
                max = notas[i][indiceAlumno];
                pmax = modulos[i];
            }
        }
        return pmax;
    }
    public static int notaMediaPersona(String persona) {
        int media = 0;
        int suma =0;
        for(int i=0; i<ASIGNATURAS; i++){
            suma = suma + notas[getIndexAlumno(persona)][i];
        }
        media = suma/ASIGNATURAS;
        return media;
    }
    public static int notaMediaModulo(String modulo) {
        int media = 0;
        int suma =0;
        for(int i=0; i<ALUMNOS; i++){
            suma = suma + notas[i][getIndexModulo(modulo)];
        }
        media = suma/ASIGNATURAS;
        return media;
    }
    public static void notaMayorQue(String alumno) {
        
    }

    public static void imprimirNotas() {

        listadoModSuspensos(alumnos);
        String[][] aprobados = quienAprueba();
        for (int j = 0; j < ASIGNATURAS; j++) {
            System.out.print("En el módulo " + modulos[j] + " han aprobado: ");          
            for(int i = 0; i < aprobados[j].length; i++){
                System.out.print(aprobados[j][i] + " ");
            }
            
            System.out.println(); 
        }
        System.out.println(getIndexModulo("PROG"));
        String[] promocionados = quienPromociona();
    for (String alumno : promocionados) {
        if (alumno != null) {
            System.out.println(alumno);
        }
    }
    System.out.println("La mayor nota en Redes es: "+notaMayorModulo("Redes"));
    System.out.println("La asignatura en la que mas ha sacado Jose: "+notaMayorPersona("Jose"));
    System.out.println("La nota media de Jose es:"+ notaMediaPersona("Jose"));
    System.out.println("La nota media de Redes es:"+ notaMediaModulo("Redes"));

}
}