package clases;

 /**
 * Creamos la Clase Figura, que será un interfaz para el resto de Objetos. Esta es la Clase Padre.
 * Debe tener un método CalcularArea() en cada clase Hija.
 * Este método se desarrollarán en las Clases Hijas.
 * @author David González Figueras.
 * @version 1.0.0
 */
public abstract class Figura {    

	double area;

/**
 * Método que hay que desarrollar en cada clase hija y es obligatorio.
 * @return double. Retonará el Area del elemento a calcular.
 */   
    abstract public double CalcularArea();
    
}
