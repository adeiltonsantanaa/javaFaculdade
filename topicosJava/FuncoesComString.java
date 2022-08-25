package topicos_java;

public class FuncoesComString {

	public static void main(java.lang.String[] args) {

		// DEIXANDO STRINGS MINUSCULAS
		String original = "OLA Eu SoU ProGrAmaDor          ";
		System.out.println("Original: " + original + "-");
		System.out.println("Deixando Minuscula: " + original.toLowerCase() + "-");
		// DEIXANDO STRINGS MAIUSCULAS
		System.out.println("Deixando Maiuscula: " + original.toUpperCase() + "-");
		// TIRANDO ESPAÇO DO FINAL
		System.out.println("Deixando Maiuscula: " + original.trim() + "-");
		// FAZENDO UM RECORTE NA STRING A PARTIR DO INDICE 2
		System.out.println("RECORTE: " + original.substring(2) + "-");
		// FAZENDO UM RECORTE NA STRING A PARTIR DO INDICE 2 ATÉ O INDICE 8
		System.out.println("RECORTE ATÉ: " + original.substring(2, 8) + "-");
		// FAZENDO TROCA DE STRINGS 
		System.out.println("TROCANDO: " + original.replace('A', 'a') + "-");
		// FAZENDO TROCA DE STRINGS "" ASPAS DUPLAS
		System.out.println("TROCANDO FRASE: " + original.replace("OLA", "OI") + "-");
		// TRAZENDO O PRIMEIRO INDICE DA STRING INFORMADA
		System.out.println("TROCANDO FRASE: " + original.indexOf("O") + "-");
		// TRAZENDO O ULTIMO INDICE DA STRING INFORMADA
		System.out.println("TROCANDO FRASE: " + original.lastIndexOf("A") + "-");
		// FUNÇÃO SPLIT = QUEBRANDO UMA STRING E COLOCANDO ELA DENTRO DE UM VETOR USANDO O ESPAÇO " " COMO SEPARADOR 
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		
		//FAZENDO UM FOR PARA VARRER MEU VETOR 
		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		
		

	}
 
}
