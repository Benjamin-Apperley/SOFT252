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
public class BackLight extends BikeDecorator
{
    public BackLight(Bike bike)
    {
        super(bike);
    }
    
    @Override
    public String getType()
    {
        return bike.getType() + ", Back Light";
    }
    
    @Override
    public double cost()
    {
        return bike.cost() + 1.25d;
    }
}
