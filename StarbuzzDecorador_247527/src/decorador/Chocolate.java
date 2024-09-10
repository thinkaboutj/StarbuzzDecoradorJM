/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

import bebidas.Beverage;

/**
 * Clase que representa el condimento "Chocolate" que se puede agregar a una
 * bebida.
 *
 * Esta clase extiende de CondimentDecorator y actúa como un decorador
 * que añade sabor a chocolate a una bebida existente. Utiliza el patrón de
 * diseño *Decorator* para añadir funcionalidad extra (costo y descripción) sin
 * modificar la clase original de la bebida.
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class Chocolate extends CondimentDecorator {

    private Beverage beverage;

    /**
     * Constructor que recibe una bebida para decorarla con chocolate.
     *
     * @param beverage la bebida a la que se le añadirá el condimento chocolate
     */
    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Devuelve el costo de la bebida más el costo adicional del chocolate.
     *
     * @return el costo de la bebida con chocolate como un valor de tipo double,
     * sumando 0.4 al costo de la bebida original
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.4;
    }

    /**
     * Devuelve la descripción de la bebida con el condimento chocolate.
     *
     * @return la descripción de la bebida con el condimento chocolate como un
     * String
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
}
