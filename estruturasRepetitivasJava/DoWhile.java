import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETI��O DO WHILE
		// FAZ UM COMANDO E AP�S ISSO CHECA SE A CONDI��O � VERDADEIRA
		// USAR QUANDO QUER CHECAR S� AO FINAL A CONDI��O

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
