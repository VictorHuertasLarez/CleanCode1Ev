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
public class Punto3D extends Punto2D{
    private double z;
    public double calcularDistancia( Punto3D param ){
        double distancia_calculada =
                Math.sqrt(
                        Math.pow((param.getX()- getX()) ,2) +
                                Math.pow((param.getY()-super.getY()) ,2) + Math.pow((param.z-z), 2));
        return distancia_calculada;
    }
    public double calcularDistancia( double x, double y, double z ){
         double distancia_calculada =
                Math.sqrt(
                        Math.pow((x- getX()) ,2) +
                                Math.pow((y-super.getY()) ,2) + Math.pow((z-this.z), 2));
         return distancia_calculada; 
    }
    public double calcularDistancia( int x, int y, int z ){
         double distancia_calculada =
                Math.sqrt(
                        Math.pow((x- getX()) ,2) +
                                Math.pow((y-super.getY()) ,2) + Math.pow((z-this.z), 2));
         return distancia_calculada; 
    }

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Punto3D() {
        super();
        z = 0.;
    }

    public double getZ() {
        return z;
    }
    

    public void setZ(double z) {
        this.z = z;
    }
    

    @Override
    public String toString() {
        return "3D{(" + super.getX() + "," + super.getY() + "," + z +") Contador=" + getContador() + " Id=" + getId() + "}";
    }
    
    
    
}
