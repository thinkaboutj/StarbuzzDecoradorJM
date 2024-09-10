/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

import bebidas.Beverage;

/**
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class WhippedCream extends CondimentDecorator{

    private Beverage beverage;
    public WhippedCream (Beverage beverage){
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