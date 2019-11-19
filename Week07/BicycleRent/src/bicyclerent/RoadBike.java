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
public class RoadBike extends Bike
{
    public RoadBike()
    {
        this.bikeType = "Road";
        this.available = true;
    }
    
    @Override
    public double cost()
    {
        return 10.00d;
    }
}
