package Util;

import java.util.ArrayList;

import model.*;

public class Programa {

	private static ArrayList<Graduando> graduandos = new ArrayList<Graduando>(); // ArrayList de graduandos

	private static ArrayList<Mestrando> mestrandos = new ArrayList<Mestrando>(); // ArrayList de mestrandos

	private static ArrayList<Doutorando> doutorandos = new ArrayList<Doutorando>(); // ArrayList de doutorandos

	private static ArrayList<Professores> professores = new ArrayList<Professores>(); // ArrayList de professores

	private static ArrayList<String> materiais = new ArrayList<String>(); // Arraylist para materiais

	private static ArrayList<Cds> cds = new ArrayList<Cds>(); // arraylist de cds

	private static ArrayList<Dvds> dvds = new ArrayList<Dvds>(); // arraylist de dvds

	private static ArrayList<Livros> livros = new ArrayList<Livros>(); // arraylist de livros

	private static ArrayList<Revistas> revistas = new ArrayList<Revistas>(); // arraylist de revistas

	public static void main(String[] args) {

		int opcao = 0;

		do {
			System.out.println("1 - Adicionar materiais");
			System.out.println("2 - Consultar a lista de materiais cadastrados");
			System.out.println("3 - Cadastrar usuário");
			System.out.println("4 - Consultar a lista de usuários cadastrados");
			System.out.println("5 - Fazer empréstimo de material");
			System.out.println("6 - Devolução de material");
			System.out.println("7 - Reserva de material");
			System.out.println("30 - Sair \n");
			System.out.println("Escolha uma opção: ");

			opcao = Integer.parseInt(Console.readLine());

			switch (opcao) {
			case 1:
				System.out.println("Adiconar materiais:");
				adicionarMateriais();

				break;
			case 2:
				System.out.println("Consulta à lista de materiais:");
				materiaisDisponiveis();

				break;

			case 3:
				System.out.println("Cadastrar usuário:");
				cadastrarUsuario();

				break;

			case 4:
				System.out.println("Listar usuários já cadastrados:");
				listarUsuarios();

				break;
			case 5:
				System.out.println("Empréstimo de materiais");
				fazerEmprestimo();
				break;

			case 6:
				System.out.println("Digite o código do livro que você deseja devolver:");
				// materiaisDisponiveis();

				break;
			case 7:
				System.out.println("Digite o código do livro para reservar:");
				// materiaisDisponiveis();
			default:
			}

		} while (opcao != 30);
	}

	public static void cadastrarUsuario() {

		int opt = 0;
		System.out.println("Informe se este usuário é: 1 - GRADUANDO, 2 - MESTRANDO, 3 - DOUTORANDO OU 4 - PROFESSOR:");
		opt = Integer.parseInt(Console.readLine());

		System.out.println("Nome: ");
		String nome = Console.readLine();

		System.out.println("CPF - apenas números: ");
		String cpfDaPessoa = Console.readLine();

		switch (opt) {
		case 1:
			Graduando graduando = new Graduando(nome, cpfDaPessoa, "Graduando");
			graduandos.add(graduando);
			System.out.println("Esta é a quantidade de material que você pode pegar emprestado:");
			System.out.println(graduando.getNumMaxMaterial());
			System.out.println("Este é o tempo de utilização de materiais que você pode ter em minutos:");
			System.out.println(graduando.getNumMaxTempo());
			break;
		case 2:
			Mestrando mestrando = new Mestrando(nome, cpfDaPessoa, "Mestrando");
			mestrandos.add(mestrando);
			System.out.println("Esta é a quantidade de material que você pode pegar emprestado:");
			System.out.println(mestrando.getNumMaxMaterial());
			System.out.println("Este é o tempo de utilização de materiais que você pode ter em minutos:");
			System.out.println(mestrando.getNumMaxTempo());
			break;
		case 3:
			Doutorando doutorando = new Doutorando(nome, cpfDaPessoa, "Doutorando");
			doutorandos.add(doutorando);
			System.out.println("Esta é a quantidade de material que você pode pegar emprestado:");
			System.out.println(doutorando.getNumMaxMaterial());
			System.out.println("Este é o tempo de utilização de materiais que você pode ter em minutos:");
			System.out.println(doutorando.getNumMaxTempo());
			break;
		case 4:
			Professores professor = new Professores(nome, cpfDaPessoa, "Professor");
			professores.add(professor);
			System.out.println("Esta é a quantidade de material que você pode pegar emprestado:");
			System.out.println(professor.getNumMaxMaterial());
			System.out.println("Este é o tempo de utilização de materiais que você pode ter em minutos:");
			System.out.println(professor.getNumMaxTempo());
			break;
		default:
			break;
		}
	}

	public static void listarUsuarios() {
		for (int i = 0; i < graduandos.size(); i++) {
			System.out.printf("%s\n", graduandos);
		}
		for (int i = 0; i < mestrandos.size(); i++) {
			System.out.printf("%s\n", mestrandos);
		}
		for (int i = 0; i < doutorandos.size(); i++) {
			System.out.printf("%s\n", doutorandos);
		}
		for (int i = 0; i < professores.size(); i++) {
			System.out.printf("%s\n", professores);
		}

	}

	public static void adicionarMateriais() {
		int opt = 0;
		System.out.println("Qual material você deseja adicionar?");
		System.out.println("Informe o que voce deseja adicionar: 1 - CDS, 2 - DVDS, 3 - LIVROS OU 4 - REVISTAS: \n");
		opt = Integer.parseInt(Console.readLine());

		System.out.println("Código do material:");
		String codigo = Console.readLine();

		System.out.println("Título do material:");
		String titulo = Console.readLine();

		System.out.println("Ano de publicação - apenas números:");
		int anoDePublicacaoInt = Integer.parseInt(Console.readLine());

		switch (opt) {
		case 1:

			System.out.println("Insira o numero de faixas do cd - apenas números:");
			int nFaixa = Integer.parseInt(Console.readLine());

			System.out.println("Insira o nome do autor:");
			String nomeAutor = Console.readLine();

			Cds cd = new Cds(codigo, titulo, anoDePublicacaoInt, nFaixa, nomeAutor);
			cds.add(cd);
			break;
		case 2:
			System.out.println("Insira o nome do autor do dvd:");
			String nomeAutorDvd = Console.readLine();

			System.out.println("Insira a região que o Dvd foi produzido:");
			String regiaoDvd = Console.readLine();

			Dvds dvd = new Dvds(codigo, titulo, anoDePublicacaoInt, nomeAutorDvd, regiaoDvd);
			dvds.add(dvd);
			break;
		case 3:
			System.out.println("Insira o nome da editora do livro:");
			String editoraLivro = Console.readLine();

			System.out.println("Insira o nome do autor do livro:");
			String autoresLivro = Console.readLine();

			System.out.println("Insira a edição do livro:");
			String edicaoLivro = Console.readLine();

			Livros livro = new Livros(codigo, titulo, anoDePublicacaoInt, editoraLivro, autoresLivro, edicaoLivro);
			livros.add(livro);
			break;
		case 4:
			System.out.println("Insira a edição da revista - apenas números:");
			int edicaoRevista = Integer.parseInt(Console.readLine());

			System.out.println("Insira o mês de publicação - apenas números:");
			int mesPublicacao = Integer.parseInt(Console.readLine());

			Revistas revista = new Revistas(codigo, titulo, anoDePublicacaoInt, edicaoRevista, mesPublicacao);
			revistas.add(revista);
		default:
			break;
		}

	}

	public static void materiaisDisponiveis() {
		for (int i = 0; i < materiais.size(); i++) {
			System.out.printf("%s\n", materiais);
		}
		for (int i = 0; i < cds.size(); i++) {
			System.out.printf("%s\n", cds);
		}
		for (int i = 0; i < dvds.size(); i++) {
			System.out.printf("%s\n", dvds);
		}
		for (int i = 0; i < livros.size(); i++) {
			System.out.printf("%s\n", livros);
		}
		for (int i = 0; i < revistas.size(); i++) {
			System.out.printf("%s\n", revistas);
		}

	}

	public static void fazerEmprestimo() {

		System.out.println("Lista de todos os usuários:");
		listarUsuarios();
		System.out.println("Digite o cpf do usuário escolhido");
		String cpf = Console.readLine();
		System.out.println("CPF: " + cpf);
		System.out.println("Lista de todos os materiais:");
		materiaisDisponiveis();

	}

	public static void fazerReserva() {

	}

	public static void devolverMaterial() {

	}
}