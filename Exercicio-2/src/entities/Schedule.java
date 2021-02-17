package entities;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
	
	private String nome;
	private Integer idade;
	private Double altura;
	
	public int index = -1;
	
	List<Schedule> agenda = new ArrayList<>();
	
	public Schedule() {
	}

	public Schedule(String nome, Integer idade, Double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public void armazenaPessoa(String nome, Integer idade, Double altura) {
		// Armazena a informações da pessoa na agenda
		agenda.add(new Schedule(nome, idade, altura));
	}
	
	public void removePessoa(String nome) {
		for(int i = 0; i < agenda.size(); i++)
	    {
	        Schedule sch = agenda.get(i);

            // Encontra uma pessoa cadastrada com nome informado.
	        if(sch.getNome().equals(nome))
	        {
	            // Remove a pessoa.
	            agenda.remove(sch);
	        }
	    }
	}
	
	public Integer buscaPessoa(String nome) {
		// Informa em que posição da agenda está a pessoa
		if(agenda.toString().contains(nome)) {
			//?????????
			index = agenda.toString().indexOf(nome);
		}
		return index;
	}
	
	public void imprimeAgenda() {
		// Imprime os dados de todas as pessoas da agenda
		for (Schedule agendaFinal : agenda) {
			System.out.println(agendaFinal);
		}
	}
	
	public void imprimePessoa(Integer index) {
		// Imprime os dados da pessoa que está na posição “i” da agenda.
		System.out.println(agenda.get(index));
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", "
				+ "Idade: " + getIdade() + " Anos" + ", "
				+ "Altura: " + String.format("%.2f", getAltura());
	}
	
}