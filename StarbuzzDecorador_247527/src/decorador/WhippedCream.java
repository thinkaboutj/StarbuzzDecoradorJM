/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

import bebidas.Beverage;

/**
 * Clase que representa el condimento "WhippedCream" que se puede agregar a una
 * bebida.
 *
 * Esta clase extiende de CondimentDecorator y actúa como un decorador que añade
 * sabor a chocolate a una bebida existente. Utiliza el patrón de diseño
 * *Decorator* para añadir funcionalidad extra (costo y descripción) sin
 * modificar la clase original de la bebida.
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class WhippedCream extends CondimentDecorator {

    private Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WhippedCream";
    }
}
