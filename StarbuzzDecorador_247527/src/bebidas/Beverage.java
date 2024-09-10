/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 * Clase abstracta que representa una bebida.
 *
 * Esta clase proporciona la estructura base para cualquier tipo de bebida que
 * pueda tener un costo y una descripción. Las clases que hereden de Beverage
 * deberán implementar los métodos abstractos definidos aquí.
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public abstract class Beverage {

    /**
     * Método abstracto que devuelve el costo de la bebida. Cada subclase deberá
     * implementar este método para proporcionar el costo específico de la
     * bebida.
     *
     * @return el costo de la bebida como un valor de tipo double
     */
    public abstract double cost();

    /**
     * Método abstracto que devuelve la descripción de la bebida. Cada subclase
     * deberá implementar este método para proporcionar una descripción
     * específica de la bebida.
     *
     * @return la descripción de la bebida como un String
     */
    public abstract String getDescription();
}
