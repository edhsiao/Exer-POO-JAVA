package absFactory;

public class FabricaForma extends AbstractFactory {

	public Forma getForma(String TipoForma) {

		if (TipoForma == null) 
			return null;

		if (TipoForma.equalsIgnoreCase("Circulo")) 
			return new Circulo();
		
		else if (TipoForma.equalsIgnoreCase("Retangulo")) 
			return new Retangulo();
		
		else if (TipoForma.equalsIgnoreCase("Triangulo")) 
			return new Triangulo();
		
		else if (TipoForma.equalsIgnoreCase("Ponto")) 
			return new Ponto();
			
			
		return null;
	}
}