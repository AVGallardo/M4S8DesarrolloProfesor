public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        FiguraGeometrica figura1 = new FiguraGeometrica("Blanco");
        FiguraGeometrica figura2 = new Circulo("Amarillo",2.0);
        FiguraGeometrica figura3 = new Cuadrado("Verde",3.0);

        figura1.colorear(figura2);
        figura2.colorear(figura3);
        figura3.colorear(figura1);

        System.out.println(figura1);
        System.out.println(figura2);
        System.out.println(figura3);
    }
}