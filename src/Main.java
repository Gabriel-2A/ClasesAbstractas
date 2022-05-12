public class Main {

    public static void main(String[] args) {
        // Todo Clase padre Figura, sera abstracta
        //Atributos: color String, relleno boolenao
        //constructor: para todos los parametros
        //GETTERS Y SETTERS
        //obtener area: abstracto y que retorne double
        //obtener perimetro: abstracto y que retorne double


        //todo clase circulo
        //Radio double
        //constructor: para todos los parametros y super
        //GETTERS Y SETTERS
        // implementar obtener area
        // implementar obtener perimetro

        //todo clase rectangulo
        //ancho double
        //alto double
        //constructor: para todos los parametros y super
        //GETTERS Y SETTERS
        // implementar obtener area
        // implementar obtener perimetro

        Circulo circulo1 = new Circulo("Verde", true, 5.67f);
        Rectangulo rectangulo1 = new Rectangulo("Morado", false, 3.4f, 6.89f);

        System.out.println(circulo1);
        System.out.println("Perimetro = " + circulo1.obtenerPerimetro());
        System.out.println("Area = " + circulo1.obtenerArea());

        System.out.println(rectangulo1);
        System.out.println("Perimetro = " + rectangulo1.obtenerPerimetro());
        System.out.println("Area = " + rectangulo1.obtenerArea());
    }

}
