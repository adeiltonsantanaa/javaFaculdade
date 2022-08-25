
public class ExpressoesLogica {

	public static void main(String[] args) {
		// OPERADORES LÓGICOS (&& = E), (|| = OU), (! = NÃO).

		// EXEMPLO OPERADOR E
		// O OPERADOR E PRECISA QUE TODAS AS CONDIÇÕES SEJAM SATISFEITAS.
		boolean e1 = true;
		boolean e2 = true;
		boolean e3 = true;

		if (e1 && e2 && e3) {
			System.out.println("&& Você passou!");
		} else {
			System.out.println("&& Você não passou!");
		}
		// EXEMPLO OPERADOR OU.
		// O OPERADOR OU PRECISA QUE PELO MENOS UMA DAS CONDIÇÕES SEJAM SATISFEITAS.
		boolean ou1 = false;
		boolean ou2 = true;
		boolean ou3 = false;

		if (ou1 || ou2 || ou3) {
			System.out.println("|| Você passou!");
		} else {
			System.out.println("|| Você não passou!");
		}
		// EXEMPLO OPERADOR NÃO
		// O OPERADOR NÃO INVERTE A CONDIÇÃO.
		boolean n1 = true;
		// boolean n2 = true;
		// boolean n3 = true;

		if (!(n1 == true)) {
			System.out.println("! Você passou!");
		} else {
			System.out.println("! Você não passou!");
		}

	}

}
