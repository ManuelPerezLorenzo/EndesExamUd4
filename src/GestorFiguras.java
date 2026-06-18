import java.util.ArrayList;

public class GestorFiguras {

    private ArrayList<Figura> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    public void mostrarAreas() {
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
        }
    }

    public void mostrarPerimetros() {

        for (Figura f : figuras) {
            System.out.println(f.calcularPerimetro());
        }
    }

    public void dibujarTodo() {

        for (Figura f : figuras) {
            f.dibujar();
        }
    }
}