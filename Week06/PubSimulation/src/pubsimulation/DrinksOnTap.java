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
public class DrinksOnTap extends GlassDrink
{
    @Override
    protected void prepareGlass()
    {
        System.out.println("Putting glass under tap");
    }
    
    
}
