/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;

/**
 *
 * @author bapperley
 */
public class PubSimulation {
    public static Idrink drink = new DrinksOnTap();
    public static Landlord L = new Landlord(drink);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        L.prepareDrink();
         
    }
    
}
