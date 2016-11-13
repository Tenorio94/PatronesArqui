

import java.util.Observable;          //Observable is here
import java.util.Random;
 
public class EventSource extends Observable implements Runnable
{
	private Random rnd = new Random();
	private String response;
	
    public void run()
    {
        try
        {
            while( true )
            {
             	int x;
        		x = (int)(rnd.nextDouble() * 15.0);   
             
             	if (x < 5)
             		response = "Temperatura";
             	else
             	{
             		if (x >= 10)
             			response = "Presion";
             		else
             			response = "Humedad";
             	}			
             
                setChanged();
                notifyObservers(response);
             
             	Thread thread = new Thread();
             	
             	thread.start();
             	thread.sleep(1000);
            }
        } catch (Exception e){}
    }
}
