/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

/**
 *
 * @author bapperley
 */
public class MyHeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double centimetres;
        double feet;
        double inches;
        
        centimetres = 45.72;
        inches = centimetres / 2.54;
        feet = inches / 12;
        System.out.println(centimetres + " is " + feet + " in feet and inches.");
    }
    
}
