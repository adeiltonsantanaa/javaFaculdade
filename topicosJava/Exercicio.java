import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// CRIANDO UM METODO QUE SOMA 3 NUMEROS + FAZENDO A SOMA DE 3 NUMEROS USANDO FOR
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int x = 2;
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			soma += y;
		}
		System.out.println(soma);
		
		//System.out.println("Digite 3 números: ");
		//int x = sc.nextInt();
		//int y = sc.nextInt();
		//int z = sc.nextInt();
		
		//System.out.println(somatoria(x, y, z));
		
		sc.close();

	}

	public static int somatoria(int a, int b, int c) {
		int soma = a+b+c;
		return soma;
		
	}
	
	
}
