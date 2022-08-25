package entities;

public class Aluno {
	
	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	
	//METODO
	public void status() {
		System.out.println("------------------");
		System.out.println("Nome:" + nome);
		System.out.println(String.format("Nota 1: %.2f", nota1));
		System.out.println(String.format("Nota 2: %.2f", nota2));
		System.out.println(String.format("Nota 3: %.2f", nota3));
	}
	
	public void calcular() {
		double soma = 0;
		soma = (getNota1() + getNota2() + getNota3());
		if (soma < 60) {
			System.out.println("Final Grade = " + soma);
			System.out.println("Failed");
			System.out.printf("Missing %.2f Points", 60 - soma);
		} else {
			System.out.println("Final Grade = " + soma);
			System.out.println("Pass");
		}
	}
	
	// GETTER E SETTER
	public String getName() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	

}
