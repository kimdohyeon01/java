package FoodMake;
import java.util.Scanner;

abstract class Food 
{	
	protected int points;

	public abstract int selectIngredients();

	public int getPoints() 
	{
	      	
		return points;
	}
	

}

