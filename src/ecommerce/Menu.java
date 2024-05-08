package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.controller.ProdutoController;
import ecommerce.model.Bolsa;
import ecommerce.model.Relogio;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);

		int opcao, numero, tipo;
		String nomeProd, material, tamanho, cor, corPulseira, corMostrador, tipoRelo;
		float valor, altura, largura, profundidade;

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

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\n Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println("\nEcommerce Acessorios Fontana sempre levando a moda até você!");
				leia.close();
				System.exit(0);

			}
			switch (opcao) {

			case 1:
				System.out.println("Cadastrar produto\n\n");

				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nomeProd = leia.nextLine();
				System.out.println("Digite o valor do produto: ");
				valor = leia.nextFloat();
				
				leia.nextLine();
				
				System.out.println("Digite o material do produto: ");
				material = leia.nextLine();

				do {
					System.out.println("Digite o tipo de produto (1-Bolsa ou 2-Relogio): ");
					tipo = leia.nextInt();
					leia.nextLine();
				} while (tipo < 1 && tipo > 2);

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite a altura da bolsa: ");
					altura = leia.nextFloat();
					System.out.println("Digite a largura da bolsa: ");
					largura = leia.nextFloat();
					System.out.println("Digite a profundidade da bolsa: ");
					profundidade = leia.nextFloat();
					leia.nextLine();
					System.out.println("Digite o tamanho da bolsa: ");
					tamanho = leia.nextLine();
					System.out.println("Digite a cor da bolsa: ");
					cor = leia.nextLine();
					produtos.cadastrar(new Bolsa (produtos.gerarNumero(), nomeProd, valor, material, altura, largura, profundidade, tamanho, cor));
					
				}
				case 2 -> {
					System.out.println("Digite a cor da pulseira: ");
					corPulseira = leia.nextLine();
					System.out.println("Digite a cor do mostrador: ");
					corMostrador = leia.nextLine();
					System.out.println("Digite o tipo: ");
					tipoRelo = leia.nextLine();
					produtos.cadastrar(new Relogio (produtos.gerarNumero(), nomeProd, valor, material, corPulseira, corMostrador, tipoRelo));
				}
				}

				keyPress();
				break;

			case 2:
				System.out.println("Listar todos os produtos\n\n");
				produtos.listarTodos();

				keyPress();
				break;

			case 3:
				System.out.println("Buscar produto\n\n");

				System.out.println("Digite o id do produto: ");
				numero = leia.nextInt();

				produtos.procurarPorId(numero);

				keyPress();
				break;

			case 4:
				System.out.println("Alterar produto\n\n");
				
				System.out.println("Digite o número da id do produto: ");
				numero = leia.nextInt();
				
				var buscaProduto = produtos.buscarNaCollection(numero);
				
				if (buscaProduto != null) {
					tipo = buscaProduto.getId();
					
					System.out.println("Digite o nome do produto: ");
					leia.skip("\\R?");
					nomeProd = leia.nextLine();
					System.out.println("Digite o valor do produto: ");
					valor = leia.nextFloat();
					
					leia.nextLine();
					
					System.out.println("Digite o material do produto: ");
					material = leia.nextLine();

					do {
						System.out.println("Digite o tipo de produto (1-Bolsa ou 2-Relogio): ");
						tipo = leia.nextInt();
						leia.nextLine();
;					} while (tipo < 1 && tipo > 2);

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite a altura da bolsa: ");
						altura = leia.nextFloat();
						System.out.println("Digite a largura da bolsa: ");
						largura = leia.nextFloat();
						System.out.println("Digite a profundidade da bolsa: ");
						profundidade = leia.nextFloat();
						leia.nextLine();
						System.out.println("Digite o tamanho da bolsa: ");
						tamanho = leia.nextLine();
						System.out.println("Digite a cor da bolsa: ");
						cor = leia.nextLine();
						produtos.alterar(new Bolsa (produtos.gerarNumero(), nomeProd, valor, material, altura, largura, profundidade, tamanho, cor));
						
					}
					case 2 -> {
						System.out.println("Digite a cor da pulseira: ");
						corPulseira = leia.nextLine();
						System.out.println("Digite a cor do mostrador: ");
						corMostrador = leia.nextLine();
						System.out.println("Digite o tipo: ");
						tipoRelo = leia.nextLine();
						produtos.alterar(new Relogio (produtos.gerarNumero(), nomeProd, valor, material, corPulseira, corMostrador, tipoRelo));
					}
					

					default -> {
						System.out.println("Tipo de produto inválido!");
					}
					}
					
				} else {
					System.out.println("O produto não foi encontrado!");
				}

				keyPress();
				break;

			case 5:
				System.out.println("Apagar produto\n\n");
				
				System.out.println("Digite o id do produto: ");
				numero = leia.nextInt();
				
				produtos.deletar(numero);
				keyPress();
				break;

			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;

			}

		}

	}

	public static void keyPress() {
		try {
			System.out.println("\n\nPressione Enter para continuar ...");
			System.in.read();

		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
