/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bebidas;

/**
 *Clase que representa una bebida específica llamada "DarkRoast".
 *
 * Esta clase extiende de  Beverage y define una implementación concreta
 * para una bebida. La bebida "DarkRoast" tiene un costo fijo y una descripción
 * definida.

 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class DarkRoast extends Beverage{

    @Override
    public double cost() {
        return 2.1;
    }

    @Override
    public String getDescription() {
        return "DarkRoast";
    }
}