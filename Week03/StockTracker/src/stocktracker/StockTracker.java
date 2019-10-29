/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;
import stocktracker.stockdatamodel.*;
/**
 *
 * @author bapperley
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        StockItem objTestItem1 = new PhysicalStockItem("Starcraft Manual");
        StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
        StockItem objTestItem3 = new ServiceStockItem("Delivery");
        
        //Lets ask each of the three items to print their type in the console
        //item 1
        if(objTestItem1.getItemType() == StockType.PHYSICALITEM)
        {
            System.out.println("Item 1 is  a PHYSICAL stock item");
        }
        else
        {
            System.out.println("Item 1 is a SERVICE stock item");
        }
        //item 2
        if(objTestItem2.getItemType() == StockType.PHYSICALITEM)
        {
            System.out.println("Item 2 is  a PHYSICAL stock item");
        }
        else
        {
            System.out.println("Item 2 is a SERVICE stock item");
        }
        //item 3
        if(objTestItem3.getItemType() == StockType.PHYSICALITEM)
        {
            System.out.println("Item 3 is  a PHYSICAL stock item");
        }
        else
        {
            System.out.println("Item 3 is a SERVICE stock item");
        }
        
        
        StockItem objTestItem4 = new PhysicalStockItem("Halo Reach");
        StockItem objTestItem5 = new ServiceStockItem("Delivery");
        
        AnObserver observer = new AnObserver();
        
        objTestItem4.registerObserver(observer);
        objTestItem5.registerObserver(observer);
        
        System.out.println("Changing quantity of physical stock item");
        
        objTestItem4.setQuantityInStock(10);
        
        System.out.println("Changing quantity of service stock item");
        
        objTestItem5.setQuantityInStock(5);
        
    }
    
}
