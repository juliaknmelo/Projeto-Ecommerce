package ecommerce;

import java.util.Scanner;
import ecommerce.model.Produto;
import ecommerce.model.Bolsa;
import ecommerce.model.Relogio;




public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//teste
		Produto p1 = new Produto (1, "bolsa vizzano",18.0f, "couro");
		p1.visualizar();
		Bolsa b1 = new Bolsa (2,"bolsa azero", 17.0f,"plastico", 14.0f, 10.0f, 18.0f,"p", "rosa");
		b1.visualizar();
		Relogio r1 = new Relogio (3, "Relogio Vivara", 100.0f, "couro", "prata", "preto", "analogico");
		r1.visualizar();
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("    Ecommerce Acessorios Fontana - Controle Admin    ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto                       ");
			System.out.println("            4 - Alterar produto                      ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
				
			case 1: 
				System.out.println("Cadastrar produto\n\n");
				
				break;
				
			case 2: 
				System.out.println("Listar todos os produtos\n\n");
				
				break;
				
			case 3: 
				System.out.println("Buscar produto\n\n");
				
				break;
				
			case 4: 
				System.out.println("Alterar produto\n\n");
				
				break;
				
			case 5: 
				System.out.println("Apagar produto\n\n");			
			
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");				
				break;
				
			
			}
			
			
			} 
		
	}

}

