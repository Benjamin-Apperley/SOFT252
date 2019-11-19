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
public class Employee 
{
    private int id;
    Bike bike;
    String type;
    double cost;
    
    public Employee(int id)
    {
        this.id = id;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public double getCost()
    {
        return this.cost;
    }
    
    public void Rent(Bike bike)
    {
        this.bike = bike;
    }
    
    public void Extra(BikeDecorator extra)
    {
        type = extra.getType();
        cost = extra.cost();
    }
}
