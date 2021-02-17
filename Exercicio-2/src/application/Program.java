package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Schedule;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Schedule agenda = new Schedule();
		
		//Adicionando pessoas ao array
		agenda.armazenaPessoa("João", 19, 1.60);
		agenda.armazenaPessoa("Jean", 51, 1.75);
		agenda.armazenaPessoa("Sandra", 31, 1.40);
		agenda.armazenaPessoa("Julia", 25, 1.60);
		agenda.armazenaPessoa("Matheus", 15, 1.62);
		agenda.armazenaPessoa("Cleber", 13, 1.30);
		agenda.armazenaPessoa("Caio", 17, 1.60);
		agenda.armazenaPessoa("Yoru", 22, 1.45);
		agenda.armazenaPessoa("Yasuo", 20, 1.56);
		agenda.armazenaPessoa("Sona", 18, 1.22);
		
		agenda.imprimeAgenda();
		
		System.out.println("-----------------------------------");
		System.out.println("REMOVA DA AGENDA: ");
		System.out.print("Nome: ");
		String removePessoa = sc.nextLine();
		System.out.printf("%s removido(a) da agenda \n", removePessoa);
		agenda.removePessoa(removePessoa);
		System.out.println("-----------------------------------");
		agenda.imprimeAgenda();
		
		System.out.println("-----------------------------------");
		System.out.print("BUSCAR PESSOA POR NOME: ");
		String buscaPessoa = sc.nextLine();
		agenda.buscaPessoa(buscaPessoa);
		System.out.println("-----------------------------------");
		if (agenda.index > -1) {
			System.out.printf("Nome encontrado no index # %d \n", agenda.index);
		} else {
			System.out.println("Nome digitado não encontrado!");
		}
		
		System.out.println("-----------------------------------");
		System.out.print("BUSCAR PESSOA POR INDEX: ");
		int index = sc.nextInt();
		agenda.imprimePessoa(index);
		
		sc.close();
	}

}
