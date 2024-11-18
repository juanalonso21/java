package arrays;

import java.util.Scanner;

public class ruleta {
    final static String[] PERSONAS = {"ana", "pedro", "juan", "maria", "noelia"};
    final static int[]  PREMIOS = {1000,10};
    final static int[] tiradas = new int[10];
/*     static int p0 =0;
    static int p1 =0;
    static int p2 =0;
    static int p3 =0;
    static int p4 =0; */ 
    static int min = 0;
    static int max = 0;
    static int[] contador = new int[5];
    static int pMax = 0;
    static int pMin = 0;
    static Scanner sc = new Scanner(System.in);

                    public static void main(String[] args) {
                        generarTirada(args);
                        calculos(args);
                        imprimirDatos(args);
                    }
                    public static void generarTirada(String[] args) {
                        for(int i=0;i<=9;i++){
                            tiradas[i] = (int) (Math.random()*5);
                        } 
                }
                public static void calculos(String[] args) {
    /*                for(int i=0;i<=9;i++){
                         switch (tiradas[i]) {
                            case 0:
                                p0++;
                                break;
                            case 1:
                                p1++;
                                break;
                            case 2:
                                p2++;
                                break;
                            case 3:
                                p3++;
                                break;
                            case 4:
                                p4++;
                                break;
                            } 
                           
    
                           }*/

                          max = tiradas[0];
                          min = tiradas[0];
                           for(int i =0;i<=9;i++){
                            contador[tiradas[i]]++;
                           }
                           for (int i = 0; i < 4 - 1; i++) {
                            for (int ic = i + 1; ic < 4; ic++) {
                                if (contador[ic] > contador[i]) {
                                    int temporal = contador[i];
                                    contador[i] = contador[ic];
                                    contador[ic] = temporal;
                                    String temporalPersona = PERSONAS[i];
                                    PERSONAS[i] = PERSONAS[ic];
                                    PERSONAS[ic] = temporalPersona;
                                }
                            }
                        }
                           for(int i=0;i<=4;i++){
                            max = contador[0];
                            min = contador[0];
                            if(contador[i]>max){
                                max = contador[i];
                                pMax = i;
                            }
                            if(contador[i]<min){
                                min = contador[i];
                                pMin = i;
                            }
                           }

                
/*                 min = p0;
                max = p0;
                if(p1<min){
                    min = p1;
                    pMin = 1;
            }
            if(p2<min){
                min = p2;
                pMin = 2;
            }
            if(p3<min){
                min = p3;
                pMin = 3;
            }
            if(p4<min){
                min = p4;
                pMin = 4;
            }
            if(p1>max){
                max = p1;
                pMax = 1;
            }
            if(p2>max){
                max = p2;
                pMax = 2;
            }
            if(p3>max){
                max = p3;
                pMax = 3;
        }
        if(p4>max){
            max = p4;
            pMax = 4;
        }*/
        
        }
        
    
    public static void imprimirDatos(String[] args) {
        System.out.println("-------------RULETA-------------");
        System.out.println("Primero vamos a imprimir las tiradas");
        for(int i=0;i<=9;i++){
            System.out.println("Ha salido el numero" +" "+tiradas[i]+" "+ "para" +" "+PERSONAS[tiradas[i]]);
            System.out.println("Presione alguna tecla para mostrar la siguiente tirada:");
            sc.nextLine(); 
        }
        System.out.println("La persona que mas ha salido es:"+ PERSONAS[pMax] + " "+ "que ha salido" + " "+ max + " "+ "veces.");
        System.out.println("La persona que menos ha salido es:"+ PERSONAS[pMin] + " "+ "que ha salido" + " "+ min + " "+ "veces.");
        System.out.println("El premio de"+ " "+PERSONAS[pMax] + " por ser la que mas ha salido son:" + PREMIOS[0]);
        System.out.println("El premio de"+ " "+PERSONAS[pMin] + " por ser la persona que menos ha salido son" + PREMIOS[1]);
        System.out.println("ARRAY ordenado:");
        for(int i=0;i<=4;i++){
            System.out.println(PERSONAS[i] + " " + contador[i]);
        }
    }  
}
