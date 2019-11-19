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
public class MountainBike extends Bike 
{
    public MountainBike()
    {
        this.bikeType = "Mountain";
        this.available = true; 
    }
    
    @Override
    public double cost()
    {
        return 12.00d;
    }
}
