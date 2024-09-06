package biblioteca;

import java.util.Scanner;

public class SistemaBibliotecaXYZ {
	
	private static ListaLivro lista;
	
	public static void main(String[]args) {
		lista = new ListaLivro(50); 
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		while (true) {
			System.out.println("\nSistema de Gerenciamento da BibliotecaXYZ");
			System.out.println("1. Adicionar Livro");
			System.out.println("2. Listar Livros:");
 			System.out.println("3. Ordenar por Titulo");
			System.out.println("4. Ordenar por Autor");
			System.out.println("5. Sair");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			 switch (opcao) {
             	case 1:
             		adicionarLivro(scanner);
             		break;
             	case 2:
             		lista.listaLivros();
             		break;
             	case 3:
             		lista.ordenarPorTitulo();
             		System.out.println("Livros ordenados por título.");
             		lista.listaLivros();
             		break;
             	case 4:
             		lista.ordenarPorAutor();
             		System.out.println("Livros ordenados por autor.");
             		lista.listaLivros();
             		break;
             	case 5:
             		System.out.println("Sistema Finalizado!");
             		scanner.close();
             		return;
             	default:
             		System.out.println("Opção inválida!");
			 }
		} 

	}
	
	 private static void adicionarLivro(Scanner scanner) {
	        System.out.print("Título: ");
	        String titulo = scanner.nextLine();
	        System.out.print("Autor: ");
	        String autor = scanner.nextLine();
	        System.out.print("Ano de Publicação: ");
	        int ano = scanner.nextInt();
	        scanner.nextLine();  

	        Livro livro = new Livro(titulo, autor, ano);
	        lista.adicionarLivro(livro);
	        System.out.println("Livro adicionado com sucesso.");
	    }
	
 }
