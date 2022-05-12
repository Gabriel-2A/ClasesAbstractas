public class Circulo extends Figura implements AccionesFiguraInterface{

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
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void rellenar() {
        System.out.println("Rellenado");
    }

    @Override
    public void duplicar() {
        System.out.println("duplicando");
    }

    @Override
    public Figura hacerPequeño() {
        Circulo circuloPequeno = new Circulo(this.color, this.relleno, this.radio);
        return circuloPequeno;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                ", relleno=" + relleno +
                '}';
    }
}
