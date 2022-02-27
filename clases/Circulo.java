package clases;

import clases.Figura;

/**
 * Creamos la Clase Circulo que es hija de Figura, que es la Clase Padre.
 * Hereda todos los métodos y atributos de la Clase padre.
 * @author David González Figueras.
 * @version 1.0.0
 */
public class Circulo extends Figura{

    final double pi=3.1416;
    private double radio;
/**
 * Función que calcula el Area del Círculo. Es obligatoria implementarla.
 * @return double. Es el resultado del Area.
 */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }
/**
 * Funcion que obtenemos el valor del radio del Círculo.
 * @return double. Es el valor del radio.
 */
    public double getRadio() {
        return radio;
    }
/**
 * Función que nos sirve para editar el radio del Círculo.
 * @param radio Necesita del parametro radio, para ser editado.
 */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
