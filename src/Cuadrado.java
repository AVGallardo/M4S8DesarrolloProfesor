public class Cuadrado extends FiguraGeometrica{
    private double sideSize;

    public Cuadrado() {}

    public Cuadrado(String color, double sideSize) {
        super(color);
        this.sideSize = sideSize;
    }

    public double getSideSize() {
        return sideSize;
    }

    public void setSideSize(double sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "sideSize=" + sideSize +
                ", color=" + getColor() +
                '}';
    }
}
