package Model;

/*
*Clase de la figura de triango que sirve para crearlo calcular su perimetro y su area y dibujarlo
* @Author Manuel Perez Lorenzo
* @Version 1
 */
public class Triangulo extends Figura {

    /**
     * Atributos necesarios para hacer los calculos y poder crear los triangulos
     */
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    /*
    *Constructor principal que permite crear los triangulos
     */
    public Triangulo(double base, double altura, double l1, double l2, double l3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = l1;
        this.lado2 = l2;
        this.lado3 = l3;
    }

    /*
    * Metodos getter que devuelve o bien la base, altura, el lado 1,2,3
     */
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getLado1() {
        return lado1;
    }


    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }


    /*
    *Metodo que calcula el area del triangulo
    * @return devuelve el calculo para el area
     */
    public double calcularArea() {
        return (base * altura) / 2;
    }

    /*
    *Metodo que calcula el perimetro del triangulo
     */
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /*
    * Metod que dibuja por pantalla el triangulo
     */
    public void dibujar() {
        System.out.println("Dibujando triangulo");
    }
}