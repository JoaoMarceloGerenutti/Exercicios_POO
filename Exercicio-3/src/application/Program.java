package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Elevator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE AS INFORMAÇÕES PARA CRIAR UM ELEVADOR");
		System.out.println("--------------------------------------------");
		
		System.out.print("Total de andares do prédio(Desconsiderando o térreo): ");
		int totalAndares = sc.nextInt();
		
		System.out.print("Capacidade do elevador(Pessoas): ");
		int capacidadeElevador = sc.nextInt();
		
		Elevator elevador = new Elevator(0, totalAndares, capacidadeElevador, 0);
		System.out.println("--------------------------------------------");
		elevador.inicializa(capacidadeElevador, totalAndares);
		System.out.println("Elevador criado com sucesso!");
		
		int numero = 0;
		boolean loop = true;
		do {
			System.out.println(elevador.imprimirMenu());
			
			System.out.print("Digite uma opção: ");
			numero = sc.nextInt();
			System.out.println("--------------------------------------------");
			
			int quantidadeGeral = 0;
			if (numero == 1) {
				
				if (elevador.getQuantidadePessoas() != elevador.getCapacidadeElevador()) {
					System.out.printf("Quantidade de pessoas atual: %d \n", elevador.getQuantidadePessoas());
					System.out.print("Digite a quantidade de pessoas que deseja adicionar ao elevador: ");
					quantidadeGeral = sc.nextInt();
					if (quantidadeGeral + elevador.getQuantidadePessoas() > elevador.getCapacidadeElevador()) {
						System.out.println("Número digitado excede o limite máximo de pessoas!");
						
					} else {
						elevador.entra(quantidadeGeral);
						System.out.println(elevador);
					}
				} else {
					System.out.println("Quantidade máxima de pessoas já atendida!");
				}
				
			} else if (numero == 2) {
				if (elevador.getQuantidadePessoas() == 0) {
					System.out.println("Não é possivel remover, não tem ninguem no elevador!");
				} else {
					System.out.printf("Quantidade de pessoas atual: %d \n", elevador.getQuantidadePessoas());
					System.out.print("Digite a quantidade de pessoas que deseja remover do elevador: ");
					quantidadeGeral = sc.nextInt();
					if (elevador.getCapacidadeElevador() - quantidadeGeral < 0) {
						System.out.println("Número digitado é maior do que a quantidade de pessoas no elevador!");
					} else {
						elevador.sai(quantidadeGeral);
						System.out.println(elevador);
					}
				}				
			} else if (numero == 3) {
				
				if (elevador.getAndarAtual() != elevador.getTotalAndares() && elevador.getAndarAtual() < elevador.getTotalAndares()) {
					
					System.out.printf("Andar atual: %d \n", elevador.getAndarAtual());
					System.out.print("Digite a quantidade de andares que deseja subir no elevador: ");
					quantidadeGeral = sc.nextInt();
					
					if (quantidadeGeral + elevador.getAndarAtual() > elevador.getTotalAndares()) {
				
						System.out.println("O número digitado é maior do que a quantidade de andares!");
						
					} else {
						
						elevador.sobe(quantidadeGeral);
						System.out.println(elevador);
						
					}
				} else {
					
					System.out.println("Não é possivel subir, você já está no ultimo andar!");
					
				}
			} else if (numero == 4) {
				
				if (elevador.getAndarAtual() <= 0) {
					System.out.println("Não é possivel descer, você já está no térreo");
				} else {
					System.out.printf("Andar atual: %d \n", elevador.getAndarAtual());
					System.out.print("Digite a quantidade de andares que deseja descer no elevador: ");
					quantidadeGeral = sc.nextInt();
					if (elevador.getAndarAtual() - quantidadeGeral < 0) {
						
						System.out.println("Não é possivel descer essa quantidade de andares!");
						
					} else {
						
						elevador.desce(quantidadeGeral);
						System.out.println(elevador);
						
					}
				}
			} else {
				
				loop = false;
				System.out.println("Saindo do menu...");
				
			}
			
			sc.nextLine();
			System.out.print("Aperte ENTER para continuar");
			@SuppressWarnings("unused")
			String enter = sc.nextLine();
			System.out.println();
			
		} while (loop == true);
		
		System.out.println(elevador);
		
		sc.close();
	}

}
