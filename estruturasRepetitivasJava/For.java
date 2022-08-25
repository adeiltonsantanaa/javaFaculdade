import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETIÇÃO FOR
		// REPETE UM BLOCO PARA UM CERTO INTERVALO DE VALORES
		// USAR QUANDO SE SABE A QUANTIDADE DE REPETIÇÕES QUE SERÁ REALIZADA OU O
		// INTERVALO DE VALORES

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite Quantos Numeros quer Somar: ");
		int qtdSoma = sc.nextInt();

		int soma = 0;

		for (int i = 0; i < qtdSoma; i++) {

			System.out.print("Digite: ");
			int x = sc.nextInt();
			soma += x;

		}
		System.out.println(soma);

		sc.close();

	}

}
