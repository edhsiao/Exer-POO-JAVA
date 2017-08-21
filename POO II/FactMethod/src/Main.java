import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int select1, select2;
		double x;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("\nEscolha a opção : ");
			System.out.println("1- Calcular Area\t0- Sair");
			select1 = sc.nextInt();
			
			if (select1 == 1) {
				
				System.out
						.println("Escolhe a figura desejado para calcular a sua area:\n1- Circulo\t2-Quadrado\t3-Triangulo Equilatero");
				FactoryFigura fabricaFigura = new FactoryFigura();
				select2 = sc.nextInt();
				if (select2 == 1) {
					
					Figura Figura1 = fabricaFigura.getFigura(select2);
					System.out.println("Digite o valor do raio do circulo:");
					x = sc.nextInt();
					Figura1.area(x);
					
				} else if (select2 == 2) {
					
					Figura Figura2 = fabricaFigura.getFigura(select2);
					System.out.println("Digite o valor do lado do quadrado:");
					x = sc.nextInt();
					Figura2.area(x);
					
				} else if (select2 == 3) {
					
					Figura Figura3 = fabricaFigura.getFigura(select2);
					System.out.println("Digite o valor do lado do triangulo:");
					x = sc.nextInt();
					Figura3.area(x);
					
				} else
					System.out.println("Figura inexistente");
			}
		} while (select1 != 0);
		
		System.out.println("Saiu!");
		System.exit(0);
	}
}
