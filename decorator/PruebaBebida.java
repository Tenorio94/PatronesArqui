public class PruebaBebida {
	public static void main(String args[]) {
		
		
		Bebida houseBlen = new Milk(new Mocha(new HouseBlen()));
		System.out.println(houseBlen.getDescripcion());
		
		
		Bebida darkRoast = new Mocha(new Soy(new Whip(new DarkRoast())));
		System.out.println(darkRoast.getDescripcion());
		
		Bebida espresso = new Milk(new Mocha(new Soy(new Whip(new Espresso()))));
		System.out.println(espresso.getDescripcion());
		
		Bebida decaf = new Milk(new Decaf());
		System.out.println(decaf.getDescripcion());
		
		System.out.println();
	}
}