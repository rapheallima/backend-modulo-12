package Tarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nomes;
		String generos;

		System.out.println("Digite os nomes separados por ',':");
		nomes = sc.nextLine();
		System.out.println();

		String[] nomesArray = nomes.split(",");

		List<String> Pessoas = new ArrayList<>();

		for (String nome : nomesArray) {
			Pessoas.add(nome.trim());
		}

		Collections.sort(Pessoas);

		System.out.println("Os nomes da lista são:");
		for (String pessoa : Pessoas) {
			System.out.println(pessoa);
		}

		System.out.println("\n********Lista com Gêneros********");

		System.out.println("\nDigite os nomes e o gênero masculino ou feminino Ex:'nome-masculino, nome-feminino':");
		generos = sc.nextLine();

		String[] generosArray = generos.split(",");

		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();

		for (String genero : generosArray) {

			String[] nomeGenero = genero.trim().split("-");

			if (nomeGenero.length == 2) {
				String nome = nomeGenero[0].trim();
				String generoPessoa = nomeGenero[1].trim().toLowerCase();

				if (generoPessoa.equals("masculino")) {
					masculino.add(nome);
				} else if (generoPessoa.equals("feminino")) {
					feminino.add(nome);
				} else {
					System.out.println("Gênero inválido para o nome: " + nome);
				}

			} else {
				System.out.println("Formato inválido para a entrada: " + genero);
			}

		}

		System.out.println("\nLista de nomes masculinos");
		for (String nome : masculino) {
			System.out.println(nome);
		}

		System.out.println("\nLista de nomes femininos");
		for (String nome : feminino) {
			System.out.println(nome);
		}

		sc.close();
	}
}
