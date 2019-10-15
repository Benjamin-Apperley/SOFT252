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
        // Create a Physical Stock Item object  and a Service Stock Item object
        PhysicalStockItem objPhysicalItem =
                new PhysicalStockItem("Snuff: A Diskworld book by Terry Pratchett", 100);
        ServiceStockItem objVirtualItem = 
                new ServiceStockItem ("Wintersmith: A Diskworld book by Terry Pratchett");
        //Test the behaviour of the Physical Stock Item
        String strMessage = objPhysicalItem.getName()
                + ", is in stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        //Test the behaviour of the Service Stock Item
        strMessage = objVirtualItem.getName()
                + ", is in stock = " + objVirtualItem.isInStock()
                + ", Qty in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
    
}
