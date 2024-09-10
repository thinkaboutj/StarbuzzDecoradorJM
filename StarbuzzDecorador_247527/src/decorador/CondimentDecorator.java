/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

import bebidas.Beverage;

/**
 * Clase abstracta que actúa como decorador para las bebidas.
 *
 * Esta clase extiende la clase Beverage y representa un condimento que
 * se puede agregar a una bebida. Al ser un decorador, debe implementar el
 * método  getDescription, pero no define cómo se calculará el costo. Las
 * subclases de {@code CondimentDecorator} deberán implementar este método y
 * especificar cómo se añade la descripción del condimento.
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * Método abstracto que devuelve la descripción de la bebida junto con el
     * condimento. Las subclases deberán implementar este método para añadir su
     * propia descripción del condimento.
     *
     * @return la descripción de la bebida con el condimento como un String
     */
    public abstract String getDescription();
}
