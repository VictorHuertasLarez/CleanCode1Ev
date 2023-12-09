/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1huertaslarez_victor_ej050302heron;

/**
 *
 * @author user
 */
public class DAM1HuertasLarez_Victor_Ej050302Heron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punto3D punto1 = new Punto3D(2.54, 5.23, 0);
        Punto3D punto2 = new Punto3D(7.23, 4.59, 0);
        Punto3D punto3 = new Punto3D(4.14, 5.83, 0);
        System.out.println("Coordenadas del punto 1: " + punto1);
        System.out.println("Coordenadas del punto 2: " + punto2);
        System.out.println("Coordenadas del punto 3: " + punto3);
        System.out.println("Distancia entre punto 1 y 2: " + punto1.calcularDistancia(punto2));
        System.out.println("Distancia entre punto 1 y 3: " + punto1.calcularDistancia(punto3));
        System.out.println("Distancia entre punto 2 y 3: " + punto2.calcularDistancia(punto3));
        System.out.println("----------\n SEGUNDO METOOD");
        System.out.println("Distancia entre punto 1 y 2: " + punto1.calcularDistancia(punto2.getX(), punto2.getY(), punto2.getZ()));
        System.out.println("Distancia entre punto 1 y 3: " + punto1.calcularDistancia(punto3.getX(), punto3.getY(), punto3.getZ()));
        System.out.println("Distancia entre punto 2 y 3: " + punto2.calcularDistancia(punto3.getX(), punto3.getY(), punto3.getZ()));
        System.out.println("----------\n FORMULA DE HERON");
        System.out.println("area del triangulo: " + Punto3D.calcularAreaHeron(punto1, punto2, punto3));//LOS CALCULOS VIENEN EN LA CLASE 
    }
    
}
