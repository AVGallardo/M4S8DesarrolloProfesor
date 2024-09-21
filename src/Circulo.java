public class Circulo extends FiguraGeometrica{
    private double radius;

    public Circulo() {
    }

    public Circulo(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radius=" + radius +
                ", color=" + getColor() +
                '}';
    }
}
