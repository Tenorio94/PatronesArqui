

import java.util.Observable;
import java.util.Observer;  /* this is Event Handler */
import java.util.Random;
 
public class Humedad implements Observer
{
    private Random rnd = new Random();
    private int humedad = (int)(rnd.nextDouble() * 35.0);
    
    public void update (Observable obj, Object arg)
    {
        if (arg instanceof String)
        {
	        int x;	
        	x = (int)(rnd.nextDouble() * 10.0);

			if (((String)arg).equals("Humedad"))
        	{        	
	        	if (x <= 5)
	        		humedad--;
	        	else
	        		humedad++;
	        }
            
            System.out.println("Humedad es: " + humedad);
        }
    }
}