import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// ESTRUTURA DE REPETI��O WHILE
		// REPETE UM BLOCO ENQUANTO UMA CONDI��O FOR VERDADEIRA
		// USAR QUANDO N�O SE SABE A QUANTIDADE DE REPETI��ES QUE SER� REALIZADA
		// PROGRAMA QUE FICA PEDINDO UM N�MERO AT� O USU�RIO DIGITAR ZERO, AO FINAL O PROGRAMA SOMA TODOS OS NUMEROS DIGITADOS

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");
		int x = sc.nextInt();

		int soma = 0;
		
		while (x != 0) {
			soma += x;
			System.out.print("Digite um n�mero: ");
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
