package com.github.dsfb.locadorajava.visao;

import java.util.Scanner;

class Visao {
	private Scanner intScanner = new Scanner(System.in);
	
	public void showMenu() {
		System.out.printf("------------------------------ Locadora GeeksBR ------------------------------");
		System.out.printf("\n\n1  - Cadastrar um filme\n");
		System.out.printf("2  - Listar todos os filmes\n");
		/*printf("3  - Cadastrar um cliente\n");		
		printf("4  - Listar todos os clientes\n");
		printf("5  - Pesquisar por filme\n");
		printf("6  - Pesquisar por cliente\n");
		printf("7  - Alugar um filme\n");
		printf("8  - Entregar um filme\n");
		printf("9  - Excluir um filme\n");
		printf("10 - Excluir um cliente\n");
		printf("11 - Limpar o arquivo de clientes\n");
		printf("12 - Limpar o arquivo de filmes\n");
		printf("13 - Alterar o nome de um cliente ja cadastrado\n");
		printf("14 - Alterar o nome de um filme ja cadastrado\n");
		printf("15 - Alterar o preco de um filme ja cadastrado\n");*/
		System.out.printf("0  - Sair\n");
	}
	
	public int getOpcao() {
		System.out.printf("Digite o numero da opcao: ");
		return intScanner.nextInt();
	}
}
