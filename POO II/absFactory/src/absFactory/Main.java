package absFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int select;
		Scanner sc1 = new Scanner(System.in);
		do {
			
			System.out.println("\nEscolha a opção : ");
			System.out.println("1- Desenhar\t0- Sair");
			select = sc1.nextInt();
			
			if (select == 1) {
				
				System.out.println("Digite a forma para ser desenhado:");
				AbstractFactory FabricaForma = new FabricaForma();
				Scanner sc2 = new Scanner(System.in);
				String nome = sc2.nextLine();
				
				if (nome.equalsIgnoreCase("Circulo")) {
					
					Forma Forma1 = FabricaForma.getForma(nome);					
					Forma1.desenha();
					
				} else if (nome.equalsIgnoreCase("Retangulo")) {
					
					Forma Forma2 = FabricaForma.getForma(nome);
					Forma2.desenha();
					
				} else if (nome.equalsIgnoreCase("Triangulo")) {
					
					Forma Forma3 = FabricaForma.getForma(nome);
					Forma3.desenha();
					
				} else if (nome.equalsIgnoreCase("Ponto")) {
					
					Forma Forma4 = FabricaForma.getForma(nome);
					Forma4.desenha();
					
				} else
					System.out.println("Desenho inexistente");
			}
		} while (select != 0);
		
		System.out.println("Saiu!");
		System.exit(0);
	}
}