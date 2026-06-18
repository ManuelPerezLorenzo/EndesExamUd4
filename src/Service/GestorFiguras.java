package Service;

import Model.Figura;
import java.util.ArrayList;

/**
 * Clase que permite gestionar las figuras creadas y guardarlas para su uso a posterior
 * @Author Manuel Perez Lorenzo
 * @Version 1
 */
public class GestorFiguras {

    /*
    *Lista que permite guardar las fuguras que se creen para despues usarlas
     */
    private ArrayList<Figura> figuras;

    /*
    *Constructor principal para gestionar el uso de las figuras
     */
    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    /*
    *Metodo para llamar a la figura que queramos
     */
    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    /*
    * Metodo que permite añadir nuestra figura a la lista creada anteriormente
     */
    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    /**
     * Metodo que calcula el Area de la figura que le pasemos tiene en cuenta si es rectangulo,
     * triangulo, etc
     */
    public void mostrarAreas() {
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
        }
    }

    /*
    * Metodo que calcula el Perimetros de la figura que le pasemos tiene en cuenta si es rectangulo,
    * triangulo, etc
     */
    public void mostrarPerimetros() {
        for (Figura f : figuras) {
            System.out.println(f.calcularPerimetro());
        }
    }

    /*
    *Metodo que dibuja o pinta la figura que le pasemos
     */
    public void dibujarTodo() {

        for (Figura f : figuras) {
            f.dibujar();
        }
    }
}