public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = {
            new Circulo(5.0),
            new Quadrado(4.0),
            new Triangulo(3.0, 6.0)
        };

        for (FormaGeometrica forma : formas) {
            System.out.printf("Area: %.2f\n", forma.calcularArea());
        }
    }
}