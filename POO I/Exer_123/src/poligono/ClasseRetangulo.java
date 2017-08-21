package poligono;

public class ClasseRetangulo {

	private int base;
	private int altura;
	
	public ClasseRetangulo(int b, int a){
		base=b;
		altura=a;
	}
	public ClasseRetangulo(){
		base=4;
		altura=3;
	}
	
	public void area(){
		System.out.println("\nArea do Retangulo = "+base*altura);
		}
	
	public void perimetro(){
		System.out.println("\nPerimetro do Retangulo = "+(2*base+2*altura));
	}
	
	public void relacao(){
		System.out.println("\nRelacao base / altura= "+base/altura);
		}
	
	public void quadrado(){
		if (base==altura)
			System.out.println("\nO retangulo eh quadrado.");
		else
			System.out.println("\nO retangulo nao eh quadrado.");
	}
	public void dimensao(){
		System.out.println("\nBase = "+base+"\nAltura = "+altura);
	}
	public static void main(String[] args) {
		ClasseRetangulo r1 = new  ClasseRetangulo(5,5);
		ClasseRetangulo r2 = new  ClasseRetangulo();
		
		r1.area();
		r1.perimetro();
		r1.relacao();
		r1.quadrado();
		r1.dimensao();
		r2.area();
		r2.perimetro();
		r2.relacao();
		r2.quadrado();
		r2.dimensao();
		
		
	}
}
