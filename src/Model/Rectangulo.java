package Model;


/**
 * Clase que implenta la creacion de un rectangulo y los calculos perimetro, area y un dibujo de la figura
 * @Author Manuel Perez Lorenzo
 * Version 1
 */
public class Rectangulo extends Figura{

    /*
    * Variables necesarios para hacer los calculos de la figura de un rectangulo
     */
    private double ancho;
    private double alto;

    /*
    *Constructor principal para crear la figura de un rectangulo segun su ancho y alto
     */
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Metodo get que devuelve el ancho del rectangulo
     * @return devuelve el ancho
     */
    public double getAncho() {
        return ancho;
    }
    /*
    *Metodo get que devuelve el alto del rectangulo
    * @return devuleve el alto
     */
    public double getAlto() {
        return alto;
    }

    /*
    *Metodo que calcula el area del rectangulo
    * @return devuelve el calculo de ancho y alto
     */
    public double calcularArea() {
        return ancho * alto;
    }

    /*
    * Metodo que calcula el perimetro del rectangulo
    * @return devuelve calculo para calcular el perimetro
     */
    public double calcularPerimetro() {
        return 2 * ancho + 2 * alto;
    }

    /*
    *Metodo que dibuja un rectangulo por pantalla teniendo en cuenta el ancho y alto de la figura
     */
    public void dibujar() {
        System.out.println("Dibujando rectangulo " + ancho + "x" + alto);
    }
}