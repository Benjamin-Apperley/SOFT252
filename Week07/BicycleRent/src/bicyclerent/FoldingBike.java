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
public class FoldingBike extends Bike
{
    public FoldingBike()
    {
        this.bikeType = "Folding";
    }
    
    @Override
    public double cost()
    {
        return 8.00d;
    }
}
