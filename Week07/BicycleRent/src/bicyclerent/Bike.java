/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicyclerent;

/**
 *
 * @author bapperley
 */
public abstract class Bike 
{
    protected String bikeType;
    
    public String getType()
    {
        return bikeType;
    }
    
    public abstract double cost();
}
