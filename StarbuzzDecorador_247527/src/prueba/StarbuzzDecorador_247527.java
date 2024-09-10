/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

import bebidas.Beverage;
import bebidas.DarkRoast;
import decorador.Milk;
import decorador.Soy;
import decorador.WhippedCream;

/**
 * Clase main donde probamos el patron decorador implementado en las clases
 * anteriores
 *
 * @author Jesus Medina ID:00000247527 (╹ڡ╹ )
 */
public class StarbuzzDecorador_247527 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("------------------- Starbuzz --------------------------");
        // Crear una bebida DarkRoast sin decoradores.
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " Cost: $" + String.format("%.2f", darkRoast.cost()));

        // Decorar DarkRoast con Milk.
        Beverage milkDarkRoast = new Milk(darkRoast);
        
        // Decorar ahora con WhippedCream.
        Beverage whipMilkDarkRoast = new WhippedCream(milkDarkRoast);
        // Mostrar la descripción y el costo tras añadir WhippedCream y Milk.
        System.out.println(whipMilkDarkRoast.getDescription() + " Cost: $" + String.format("%.2f", whipMilkDarkRoast.cost()));

        // Añadir Soy al decorador anterior (WhippedCream y Milk).
        Beverage soyWhipMilkDarkRoast = new Soy(whipMilkDarkRoast);
        // Mostrar la descripción y el costo tras añadir Soy además de WhippedCream y Milk.
        System.out.println(soyWhipMilkDarkRoast.getDescription() + " Cost: $" + String.format("%.2f", soyWhipMilkDarkRoast.cost()));

        System.out.println("-------------------------------------------------------");

    }

}
