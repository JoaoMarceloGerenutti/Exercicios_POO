package entities;

public class Elevator {

	private Integer andarAtual;
	private Integer totalAndares;
	private Integer capacidadeElevador;
	private Integer quantidadePessoas;
	
	public Elevator() {
	}

	public Elevator(Integer andarAtual, Integer totalAndares, Integer capacidadeElevador, Integer quantidadePessoas) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capacidadeElevador = capacidadeElevador;
		this.quantidadePessoas = quantidadePessoas;
	}

	public Integer getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}

	public Integer getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(Integer totalAndares) {
		this.totalAndares = totalAndares;
	}

	public Integer getCapacidadeElevador() {
		return capacidadeElevador;
	}

	public void setCapacidadeElevador(Integer capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}

	public Integer getQuantidadePessoas() {
		return quantidadePessoas;
	}

	public void setQuantidadePessoas(Integer quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public void inicializa(Integer capacidadeElevador, Integer totalAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
	}
	
	public void entra(Integer quantidade) {
		this.quantidadePessoas += quantidade;
	}
	
	public void sai(Integer quantidade) {
		this.quantidadePessoas -= quantidade;
	}
	
	public void sobe(Integer quantidadeAndares) {
		this.andarAtual += quantidadeAndares;
	}
	
	public void desce(Integer quantidadeAndares) {
		this.andarAtual -= quantidadeAndares;
	}
	
	public String imprimirMenu() {
		return 	"-------------------------------------------- \n"
				+ "MENU DE OPÇÕES \n"
				+ "Digite (1) para adicionar pessoas ao elevador \n"
				+ "Digite (2) para remover pessoas do elevador \n"
				+ "Digite (3) para subir o elevador \n"
				+ "Digite (4) para descer o elevador \n"
				+ "Para sair digite qualquer outro número fora do menu de opções \n"
				+ "--------------------------------------------";
	}
	
	@Override
	public String toString() {
		String terreo = " ";
		if (getAndarAtual() == 0) {
			 terreo = " (Térreo)";
		}
		return  "-------------------------------------------- \n"
				+ "INFORMAÇÕES DO ELEVADOR \n"
				+ "Tamanho do prédio: " + getTotalAndares() + " Andares" + "\n"
				+ "Andar atual: " + getAndarAtual() + terreo + "\n"
				+ "Capacidade total do elevador: " + getCapacidadeElevador() + " Pessoas" + "\n"
				+ "Quantidade de pessoas no elevador: " + getQuantidadePessoas() + "\n"
				+ "--------------------------------------------";
	}
	
}
