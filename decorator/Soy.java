

class Soy extends DecoradorBebida {
	public Soy (Bebida bebidaDecorada) {
			super(bebidaDecorada);
	}
	
	public void agregar() {
		bebidaDecorada.agregar();
	}
	
	public String getDescripcion() {
		return bebidaDecorada.getDescripcion() + ", Soy";
	}
}