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
public abstract class GlassDrink 
{
    public final void makeDrink()
    {
        prepareGlass();
        pourDrink();
    }
    
    protected void pourDrink()
    {
        System.out.println("Pouring drink into glass");
    }
    
    protected abstract void prepareGlass();
}
