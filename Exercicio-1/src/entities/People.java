package entities;

import java.util.Date;

import model.exceptions.DomainException;

public class People {
	
	private static final Date ano = new Date();
	
	private String nome;
	private Date data_nascimento;
	private Double altura;
	
	public People() {
	}

	public People(String nome, Date data_nascimento, Double altura) {
		if (data_nascimento.after(ano)){
			throw new DomainException("Data de Nascimento deve ser anterior da data atual");
		}
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer calculaIdade() {
		@SuppressWarnings("deprecation")
		int idade = ano.getYear() - getData_nascimento().getYear();
		return idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", "
				+ "Data de Nascimento: " + getData_nascimento() + ", "
				+ "Altura: " + String.format("%.2f", getAltura()) + ", "
				+ "Idade: " + calculaIdade() + " Anos";
	}
	
}
