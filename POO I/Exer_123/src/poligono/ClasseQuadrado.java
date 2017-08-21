package poligono;

public class ClasseQuadrado {
			
	private static int lado;
	private int aumento;
	
	public ClasseQuadrado(){
		lado = 5;
		aumento = 2;
		}
	
	public ClasseQuadrado(int l, int a){
		lado = l;
		aumento = a;
		}
	public void aumentar(){
		System.out.println("\nO lado do quadrado de lado "+lado+" foi aumentado em: "+aumento);
		System.out.println("\nArea depois do aumento: "+(lado+aumento)*(lado+aumento));
	}
	
	public static void main(String[] args) {
		
		ClasseQuadrado q1 = new ClasseQuadrado();
		ClasseQuadrado q2 = new ClasseQuadrado(3,1);
		q1.aumentar();
		q2.aumentar();
		
		for (int i = 1; i <= 10;i++ ){    
	           lado = (int) (Math.random()*10);    
	           System.out.println(i+"- Area do quadrado de lado "+lado+" = "+lado*lado);   
	       }    


	
	}
}
