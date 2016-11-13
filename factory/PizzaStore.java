import java.io.*;
public class PizzaStore {
    public static void main (String args[]) throws IOException {
   	int entrada = 0;
   	Pizza pizza;
   	BufferedReader stdin;
    InputStreamReader en= new InputStreamReader(System.in);
	stdin = new BufferedReader(en);
    	System.out.println("\t Selecciona la tienda \n");
    	System.out.println("\t\t1:\tNew York\n\t\t2:\tChicago\n\t\t3:\tCalifornia\n");
    	entrada = Integer.parseInt(stdin.readLine());
    	switch(entrada){
    		case 1:
    		NYPizzaFactory fac1 = new NYPizzaFactory();
    		System.out.println("\t Selecciona la Pizza \n");
    		System.out.println("\t\t1:\tHawaiana\n\t\t2:\tPepperoni\n\t\t3:\tVegetariana\n");
    		entrada = Integer.parseInt(stdin.readLine());
    		switch(entrada){
	    		case 1:
	    		pizza= fac1.createPizza("HawaianPizza");
	    		case 2:
	    		pizza= fac1.createPizza("VeggiePizza");
	    		case 3:
	    		pizza= fac1.createPizza("PepperoniPizza");
	    		System.out.println("\t Elaborando: Pizza: "+pizza.getBranch()+"\n\t   En la fabrica de "+fac1.store);
	   	   		System.out.println("\t Agregando ingredientes:\n"+pizza.getIngredients()+"\n");
	   	    	System.out.println("\t Agregando estilo: \n"+fac1.StoreIng+"\n");
    		}
    		break;
    		case 2:
    		ChicagoPizzaFactory fac2 = new ChicagoPizzaFactory();
    		System.out.println("\t Selecciona la Pizza \n");
    		System.out.println("\t\t1:\tHawaiana\n\t\t2:\tPepperoni\n\t\t3:\tVegetariana\n");
    		entrada = Integer.parseInt(stdin.readLine());
    		switch(entrada){
    		case 1:
    		pizza= fac2.createPizza("HawaianPizza");
    		case 2:
    		pizza= fac2.createPizza("VeggiePizza");
    		case 3:
    	pizza= fac2.createPizza("PepperoniPizza");
    	System.out.println("\t Elaborando: Pizza: "+pizza.getBranch()+"\n\t   En la fabrica de "+fac2.store);
   	    System.out.println("\t Agregando ingredientes:\n"+pizza.getIngredients()+"\n");
   	    System.out.println("\t Agregando estilo: \n"+fac2.StoreIng+"\n");
    		}
    		break;
    		case 3:
    		entrada = Integer.parseInt(stdin.readLine());
    		System.out.println("\t Selecciona la Pizza \n");
    		System.out.println("\t\t1:\tHawaiana\n\t\t2:\tPepperoni\n\t\t3:\tVegetariana\n");
    		CaliforniaPizzaFactory fac3 = new CaliforniaPizzaFactory();
    		switch(entrada){
    		case 1:
    		pizza= fac3.createPizza("HawaianPizza");
    		case 2:
    		pizza= fac3.createPizza("VeggiePizza");
    		case 3:
    		pizza= fac3.createPizza("PepperoniPizza");
    		 System.out.println("\t Elaborando: Pizza: "+pizza.getBranch()+"\n\t   En la fabrica de "+fac3.store);
   	  		 System.out.println("\n\t Agregando ingredientes:\n"+pizza.getIngredients()+"\n");
   	    	 System.out.println("\t Agregando estilo: \n"+fac3.StoreIng+"\n");
    		}
    		break;
    		}
    	
      }
}
