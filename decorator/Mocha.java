

class Mocha extends DecoradorBebida {
	public Mocha (Bebida bebidaDecorada) {
			super(bebidaDecorada);
	}
	
	public void agregar() {
		bebidaDecorada.agregar();
	}
	
	public String getDescripcion() {
		return bebidaDecorada.getDescripcion() + ", Mocha";
	}
}