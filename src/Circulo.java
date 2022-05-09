public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, boolean relleno, double radio) {
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {



        return 0;
    }

    @Override
    public double obtenerPerimetro() {

        return 0;
    }
}
