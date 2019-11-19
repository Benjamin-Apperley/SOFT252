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
public class BicycleRent 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Bike bike1 = new MountainBike();
        Employee emp1 = new Employee(1); 
        
        bike1.setAvailable(false);
        
        emp1.Rent(bike1);
        emp1.Extra(new Helmet(bike1));
        
        System.out.println(emp1.getType() + ": £" + emp1.getCost() + "p");
    }
    
}
