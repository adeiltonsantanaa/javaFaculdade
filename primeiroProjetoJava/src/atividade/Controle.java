package atividade;

public class Controle {
	String cor;
	String marca;
	int qtd_botoes;
	boolean ligado;
	
	
	void status() {
		System.out.println("--------------------------");
		System.out.println("Marca: " + getMarca());
		System.out.println("Cor: " + getCor());
		System.out.println("Quantidade de Botões: " + getQtd_botoes());
		System.out.println("ligado: " + isLigado());
	}
	
	void ligar() {
		if (this.ligado == true) {
			System.out.println("\nErro! O controle já está ligado!\n");
		} else {
			this.ligado = true;
			System.out.println("\nSucesso! O controle foi ligado!\n");
		}
		
	}
	void desligar() {
		if (this.ligado == false) {
			System.out.println("\nErro! O controle já está desligado!\n");
		} else {
			this.ligado = false;
			System.out.println("\nSucesso! O controle foi desligado!\n");
		}
		
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtd_botoes() {
		return qtd_botoes;
	}

	public void setQtd_botoes(int qtd_botoes) {
		this.qtd_botoes = qtd_botoes;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	

}
