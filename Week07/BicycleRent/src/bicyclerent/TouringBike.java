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
public class TouringBike extends Bike 
{
    public TouringBike()
    {
        this.bikeType = "Touring";
        this.available = true;
    }
    
    @Override
    public double cost()
    {
        return 11.00d;
    }
}
