package Model;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return 3.1416 * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * 3.1416 * radio;
    }

    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + radio);
    }
}