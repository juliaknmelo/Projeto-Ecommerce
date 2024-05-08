package ecommerce;

import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("       Ecommerce PetShow - Controle Admin            ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar cliente                    ");
			System.out.println("            2 - Listar todos os clientes             ");
			System.out.println("            3 - Cadastrar produto                    ");
			System.out.println("            4 - Listar todos os produtos             ");
			System.out.println("            5 - Buscar produto                       ");
			System.out.println("            6 - Alterar produto                      ");
			System.out.println("            7 - Apagar produto                       ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1: 
				System.out.println("Cadastrar cliente\n\n");
				
				break;
				
			case 2: 
				System.out.println("Listar todos os clientes\n\n");
				
				break;
				
			case 3: 
				System.out.println("Cadastrar produto\n\n");
				
				break;
				
			case 4: 
				System.out.println("Listar todos os produtos\n\n");
				
				break;
				
			case 5: 
				System.out.println("Buscar produto\n\n");
				
				break;
				
			case 6: 
				System.out.println("Alterar produto\n\n");
				
				break;
				
			case 7: 
				System.out.println("Apagar produto\n\n");			
			
				break;
				
			default:
				System.out.println("\nOpção Inválida!\n");				
				break;
				
			
			}
			
			
			} 
		
	}

}

