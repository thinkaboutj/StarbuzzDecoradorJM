/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 *Clase que representa una bebida específica llamada "Decaf".
 *
 * Esta clase extiende de Beverage y define una implementación concreta
 * para una bebida. La bebida "Decaf" tiene un costo fijo y una descripción
 * definida.

 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class Decaf extends Beverage {

    @Override
    public double cost() {
        return 3.1;
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
