

import java.util.Observable;
import java.util.Observer;  /* this is Event Handler */
import java.util.Random;
 
public class Presion implements Observer
{
    private Random rnd = new Random();
    private int presion = (int)(rnd.nextDouble() * 1013.0);
    
    public void update (Observable obj, Object arg)
    {
        if (arg instanceof String)
        {
	        int x;
        	x = (int)(rnd.nextDouble() * 10.0);
        	
        	if (((String)arg).equals("Presion"))
        	{
	        	if (x <= 5)
	        		presion--;
	        	else
	        		presion++;
	        }
            
            System.out.println("Presion es: " + presion + "\n");
        }
    }
}