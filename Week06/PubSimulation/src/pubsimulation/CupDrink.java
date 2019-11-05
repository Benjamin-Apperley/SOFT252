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
public abstract class CupDrink 
{
    public final void makeDrink()
    {
        boilWater();
        brew();
        pourResult();
        addItem();
    }
    
    protected void boilWater()
    {
        System.out.println("Boiling water");
    }
    
    protected void pourResult()
    {
        System.out.println("Pouring result into cup");
    }
    
    protected abstract void brew();
    
    protected abstract void addItem();
}
