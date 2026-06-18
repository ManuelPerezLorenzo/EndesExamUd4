package Model;

/**
 * Clase que sirve para llamar a los metodos usando herencia
 */
public abstract class Figura {

    /*
    *Metodos que llaman a las figuras para usarlos a posteriori
     */
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public abstract void dibujar();
}
