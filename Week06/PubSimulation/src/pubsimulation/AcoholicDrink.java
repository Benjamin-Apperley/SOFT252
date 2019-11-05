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
public abstract class AcoholicDrink 
{
    public final void makeDrink()
    {
        addIce();
        addSpirit();
        addMixer();
        addGarnish();
    }
    
    protected void addIce()
    {
        System.out.println("Adding ice to glass");
    }
    
    protected void addMixer()
    {
        System.out.println("Adding mixer to glass");
    }
    
    protected abstract void addSpirit();
    
    protected abstract void addGarnish();
}
