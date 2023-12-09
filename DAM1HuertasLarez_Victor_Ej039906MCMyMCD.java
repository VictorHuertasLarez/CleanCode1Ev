/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1huertaslarez_victor_ej039906mcmymcd;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DAM1HuertasLarez_Victor_Ej039906MCMyMCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Este programa pide dos numeros enteros positivos, dentro de un rango definido, y calcula su MCM y MCD
        int min = 0;
        int max = Integer.MAX_VALUE;
        int numGrande;
        int numPequeño;
        int resto;
        int maximoComunDivisor = 0;
        int minimoComunMultiplo = 0;
        Scanner teclado = new Scanner(System.in);
        String entrada;
        //Pedimos los numeros por teclado y realizamos comprobaciones de contorno
        do{
            System.out.println("Introduzca un numero positivo: ");
            entrada = teclado.nextLine();
            numGrande = Integer.parseInt(entrada);
        }while(!(numGrande > min && numGrande <= max ));
        do{
            System.out.println("Introduzca un numero menor que el anterior: ");
            entrada = teclado.nextLine();
            numPequeño = Integer.parseInt(entrada);
        }while(!( numPequeño > min && numPequeño <= numGrande));
        //Ya hemos pedido los numeros y ahora vamos a calcular el MCM y el MCD, por eso creamos otras 2 variables
        int dividendo = numGrande;
        int divisor = numPequeño;
        do{
            resto = dividendo%divisor;
            if(resto == 0){
                maximoComunDivisor = divisor;//Si el resto de la division es 0, el divisor es el MCD
                System.out.println("El maximo comun divisor de " + numGrande + " y " + numPequeño + " es: " + maximoComunDivisor);
                break;    
            }
            else{
                dividendo = divisor;
                divisor = resto;
            }
        }while( resto != 0);
        minimoComunMultiplo = (numGrande*numPequeño)/maximoComunDivisor;
        System.out.println("El minimo comun multiplo de " + numGrande + "y " + numPequeño + " es: " + minimoComunMultiplo);
    
    }
    
}
