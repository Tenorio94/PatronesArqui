

class Whip extends DecoradorBebida {
	public Whip (Bebida bebidaDecorada) {
			super(bebidaDecorada);
	}
	
	public void agregar() {
		bebidaDecorada.agregar();
	}
	
	public String getDescripcion() {
		return bebidaDecorada.getDescripcion() + ", Whip";
	}
}