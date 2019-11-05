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
public class LongDrink extends AcoholicDrink
{
    @Override
    protected void addGarnish()
    {
        System.out.println("Adding simple garnish");
    }
    
    @Override
    protected void addSpirit()
    {
        System.out.println("Adding spirit to glass");
    }
}
