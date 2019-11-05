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
public class Coffee extends CupDrink
{
    @Override
    protected void addItem()
    {
        System.out.println("Adding milk");
    }
    
    @Override
    protected void brew()
    {
        System.out.println("Brewing coffee in boiled water");
    }
    
    
}
