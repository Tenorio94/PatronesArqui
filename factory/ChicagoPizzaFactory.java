public class ChicagoPizzaFactory {
	public String store="Chicago";
	public String StoreIng= "\n\t   *\tCorteza Gruesa \n\t   *\tSalsa Rich\n\t   *\tMucho Queso";
    public static Pizza createPizza(String pizzaType) {
        switch (pizzaType.charAt(0)) {
            case 'H':
                return new HawaianPizza();
            case 'V':
                return new VeggiePizza();
            case 'P':
                return new PepperoniPizza();
        }
        throw new IllegalArgumentException("La pizza " + pizzaType + " no se reconoce.");
    }
}

