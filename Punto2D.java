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
public class Punto2D {
    private double x;
    private double y;
    private static int contador = 0;// contador total de puntos
    private static final String NOMBRE = "Punto";//Utilizamos para ahorrar memoria
    private int id;
    
    //El metodo calcula la distancia entre dos objetos de la clase punto
    public double calcularDistancia( Punto2D param ){
        double distancia_calculada =
                Math.sqrt(
                        Math.pow((param.x-x) ,2) +
                                Math.pow((param.y-y) ,2) );
        return distancia_calculada;
    }
    public static double calcularAreaHeron( Punto2D param1, Punto2D param2, Punto2D param3 ){
        double a = param1.calcularDistancia(param2);
        double b = param1.calcularDistancia(param3);
        double c = param2.calcularDistancia(param3);
        double semiPerimetro = (a+b+c)/2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro - a)*(semiPerimetro - b)*(semiPerimetro - c));
        return area;
    }

    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
        contador++;
        id = contador;
    }

    public Punto2D(){
        x = 0.;
        y = 0.;
        contador++;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public static String getNOMBRE() {
        return NOMBRE;
    }

    public static int getContador() {
        return contador;
    }


    public int getId() {
        return id;
    }

    

    @Override
    public String toString() {
        return "Punto2D{(" + x + "," + y + ") Contador=" + contador + " Id=" + id + '}';
    }

    
    
    
}
