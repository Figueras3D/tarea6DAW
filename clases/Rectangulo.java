package clases;

 /**
 * Creamos la Clase Rectangulo que es hija de Figura, que es la Clase Padre.
 * Hereda todos los métodos y atributos de la Clase padre.
 * @author David González Figueras.
 * @version 1.0.0
 */
public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

/**
 * Función que calcula el Area del Rectangulo. Es obligatoria implementarla.
 * @return double. Es el resultado del Area.
 */   
    public double CalcularArea() {        
        return this.area=(base*altura);
     }
/**
 * Función que obtenemos el valor de la base del Rectangulo.
 * @return double. Es el valor del base.
 */
    public double getBase() {
        return base;
    }
/**
 * Función que nos sirve para editar la base del Rectangulo.
 * @param base Necesita del parametro base, para ser editado.
 */
    public void setBase(double base) {
        this.base = base;
    }
/**
 * Función que obtenemos el valor de la altura del Rectangulo.
 * @return double. Es el valor de la altura.
 */
    public double getAltura() {
        return altura;
    }
/**
 * Función que nos sirve para editar la altura del Rectangulo.
 * @param altura Necesita del parametro altura, para ser editado.
 */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
