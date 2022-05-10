public class Rectangulo extends Figura{

    private double ancho;
    private double alto;

    public Rectangulo(String color, boolean relleno, double ancho, double alto) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double obtenerArea() {
        return ancho * alto;
    }

    @Override
    public double obtenerPerimetro() {
        return (ancho + alto) * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color='" + color + '\'' +
                ", relleno=" + relleno +
                ", ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
