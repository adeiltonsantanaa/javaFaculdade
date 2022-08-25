import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETIÇÃO WHILE
		// REPETE UM BLOCO ENQUANTO UMA CONDIÇÃO FOR VERDADEIRA
		// USAR QUANDO NÃO SE SABE A QUANTIDADE DE REPETIÇÕES QUE SERÁ REALIZADA
		// PROGRAMA QUE FICA PEDINDO UM NÚMERO ATÉ O USUÁRIO DIGITAR ZERO, AO FINAL O PROGRAMA SOMA TODOS OS NUMEROS DIGITADOS

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int x = sc.nextInt();

		int soma = 0;
		
		while (x != 0) {
			soma += x;
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			
		}
		System.out.println("While encerrado! " + soma);

		sc.close();
		
		/*int controle = 0;
		while (controle <= 3) {
			System.out.println("Exe: " + controle);
			controle++;
		}*/

	}

}
