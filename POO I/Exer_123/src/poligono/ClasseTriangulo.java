package poligono;

public class ClasseTriangulo {
	
	private double base;
	private double altura;
	
	public ClasseTriangulo(){
		base=5;
		altura=5;
	}
	public ClasseTriangulo (int bas, int alt){
		base=bas;
		altura=alt;
	}
	
	public void mostra(){
		System.out.println("\nBase = "+base+"\nAltura = "+altura);
	}
	public void area(){
		System.out.println("\nArea do Triangulo = "+(base*altura)/2);
	}
	
	public static void main(String[] args) {
		
		ClasseTriangulo t1 = new ClasseTriangulo();
		ClasseTriangulo t2 = new ClasseTriangulo(3, 4);
		t1.area();
		t1.mostra();
		t2.area();
		t2.mostra();
		}

		
	
	
	
	
}
