
// clase decorador abstracto 
abstract class DecoradorBebida implements Bebida {
	protected Bebida bebidaDecorada;  // bebida a decorar
	
	public DecoradorBebida (Bebida bebidaDecorada) {
		this.bebidaDecorada = bebidaDecorada;
	}
	
}