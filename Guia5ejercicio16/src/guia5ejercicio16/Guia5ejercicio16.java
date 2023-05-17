/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores 
 * aleatorios y le pida al usuario un numero a buscar en el vector. 
 * El programa mostrará donde se encuentra el numero y si se encuentra repetido.
 */
package guia5ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alegorri
 */
public class Guia5ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int i;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int [] Vector = new int [n];
        
        
        for (i=0;i<n;i++){
            Vector[i] = (int)(Math.random()*10+1);
            System.out.println("vector " + Vector[i]);
        
    }
        System.out.println("Ingrese un numero a buscar");
        int num = leer.nextInt();
        
        for (i=0;i<n;i++){
            if (Vector[i]==num){
            System.out.println("el numero se encuentra en la posicion " + i);
            }
    
}
    }
}