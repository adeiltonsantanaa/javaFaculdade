package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class AlunoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
		System.out.print("Nome aluno: ");
		a1.setName(sc.next());
		System.out.print("Nota 1: ");
		a1.setNota1(sc.nextDouble());
		System.out.print("Nota 2: ");
		a1.setNota2(sc.nextDouble());
		System.out.print("Nota 3: ");
		a1.setNota3(sc.nextDouble());
		a1.status();
		a1.calcular();
		
		
		
		
		sc.close();

	}

}
