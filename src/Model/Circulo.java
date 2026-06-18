package Model;


/*
* Clase que se centra en la figura circulo
* @Author Manuel Perez Lorenzo
* @Version 1
 */
public class Circulo extends Figura{

    /**
     * Atributo radio para calcular despues el Area y Perimetro
     */
    private double radio;

    /*
    * Constructor que permite crear un circulo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /*
    *Metodo Getter para llamar al radio
     */
    public double getRadio() {
        return radio;
    }
    /*
    * Metodo para establece un radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }


    /**
     * Metodo que calcula el area de un circulo usando el atributo radio creado
     * @return devuelve el resultado de la area
     */
    public double calcularArea() {
        return 3.1416 * radio * radio;
    }

    /**
     * Metodo que calcula el perimitro del circulo usando el atributo radio
     * @return devulve el resultado del perimetro
     */
    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }


    /*
    * Metodo que imprime un dibujo por pantalla segun el radio que tenga el circulo
     */
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}