
 
import java.util.Observable;
import java.util.Observer;  /* this is Event Handler */
import java.util.Random;
 
public class Temperatura implements Observer
{
    private Random rnd = new Random();
    private int temp = (int)(rnd.nextDouble() * 35.0);
    
    public void update (Observable obj, Object arg)
    {
        if (arg instanceof String)
        {
	        int x;
        	x = (int)(rnd.nextDouble() * 10.0);
        	
        	if (((String)arg).equals("Temperatura"))
        	{
	        	if (x <= 5)
	        		temp--;
	        	else
	        		temp++;
	        }
            
            System.out.println("Cambio la " + (String)arg);
            System.out.println("Temperatura es: " + temp);
        }
    }
}
