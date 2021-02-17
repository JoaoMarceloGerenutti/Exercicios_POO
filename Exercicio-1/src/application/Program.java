package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.People;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("DIGITE AS INFORMAÇÕES DO USUÁRIO");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Data de nascimento(DD/MM/AAAA): ");
			Date data_nascimento = sdf.parse(sc.next());
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			People pessoa = new People(nome, data_nascimento, altura);
			
			System.out.println(pessoa);
			
		} catch (ParseException e) {
		System.out.println("Formato de data inválida!");
		} catch (DomainException e) {
		System.out.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
		System.out.println("Erro inesperado!");
		}
		sc.close();
	}

}
