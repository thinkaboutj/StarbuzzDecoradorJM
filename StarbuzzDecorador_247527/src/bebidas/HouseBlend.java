/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 * Clase que representa una bebida específica llamada "HouseBlend".
 *
 * Esta clase extiende de Beverage y define una implementación concreta
 * para una bebida. La bebida "HouseBlend" tiene un costo fijo y una descripción
 * definida.
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class HouseBlend extends Beverage {

    /**
     * Devuelve el costo de la bebida "HouseBlend".
     *
     * @return el costo de la bebida como un valor de tipo double, en este caso
     * 1.9
     */
    @Override
    public double cost() {
        return 1.9;
    }

    /**
     * Devuelve la descripción de la bebida "HouseBlend".
     *
     * @return la descripción de la bebida como un String, en este caso
     * "HouseBlend"
     */
    @Override
    public String getDescription() {
        return "HouseBlend";
    }
}
