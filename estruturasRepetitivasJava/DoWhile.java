import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETIÇÃO DO WHILE
		// FAZ UM COMANDO E APÓS ISSO CHECA SE A CONDIÇÃO É VERDADEIRA
		// USAR QUANDO QUER CHECAR SÓ AO FINAL A CONDIÇÃO

		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n ", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		
		
		sc.close();
	}

}
