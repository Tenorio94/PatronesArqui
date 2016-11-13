

import java.util.Random;

public class Clima
{
    public static void main(String args[])
    {
        System.out.println("Sistema del Clima\n");
 
        // create an event source - reads from stdin
        final EventSource evSrc = new EventSource();
 
        // create an observer
        final Temperatura temp = new Temperatura();
        final Humedad humedad = new Humedad();
 		final Presion presion = new Presion();
 
 
        // subscribe the observer to the event source
        evSrc.addObserver(presion);
        evSrc.addObserver(humedad);
        evSrc.addObserver(temp);

        // starts the event thread
        Thread thread = new Thread(evSrc);
        thread.start();
    }
}
