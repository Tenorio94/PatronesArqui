

class Milk extends DecoradorBebida {
	public Milk (Bebida bebidaDecorada) {
			super(bebidaDecorada);
	}
	
	public void agregar() {
		bebidaDecorada.agregar();
	}
	
	public String getDescripcion() {
		return bebidaDecorada.getDescripcion() + ", Milk";
	}
}