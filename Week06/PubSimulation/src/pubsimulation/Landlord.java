/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pubsimulation;
import java.util.Scanner;
/**
 *
 * @author bapperley
 */
public class Landlord 
{
    private Idrink drink;
    
    public Landlord(Idrink newdrink)
    {
        drink = newdrink;
    }
    
    public void prepareDrink()
    {
        System.out.println("What can i get ya?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        
        if(answer.equals("Pint"))
        {
            System.out.println("One pint coming up");
            drink = new DrinksOnTap();
            drink.serveDrink();
        }
        else if(answer.equals("Bottle"))
        {
            System.out.println("One bottle coming up");
            drink = new BottledDrinks();
            drink.serveDrink();
        }
        
        else if(answer.equals("Tea"))
        {
            System.out.println("One tea coming up");
            drink = new Tea();
            drink.serveDrink();
        }
        
        else if(answer.equals("Coffee"))
        {
            System.out.println("One cofee coming up");
            drink = new Coffee();
            drink.serveDrink();
        }
        
        else if(answer.equals("Long"))
        {
            System.out.println("One long coming up");
            drink = new LongDrink();
            drink.serveDrink();
        }
        
        else if(answer.equals("Cocktail"))
        {
            System.out.println("One cocktail coming up");
            drink = new Cocktail();
            drink.serveDrink();
        }
        else
        {
            System.out.println("Sorry what was that?");
        }
    }
}
