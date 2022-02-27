import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

 /**
  * Funcion Principal en el que se ejecuta y corre el Código de Java que
  * creamos durante el Proyecto.
  * @author David González Figueras.
  * @version 1.0.0
  * @return self. Se devuelve así misma ejecutandose.
  */
public class Main {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);
        
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }
    /**
     * Funcion que calcula el area de Circulo.
     * @param f Se le pasa un Objeto como parámetro.
     * @return double. Devuelve el valor del Area del Objeto en coma flotante.
     */
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        
        return f.CalcularArea();
    }
}
