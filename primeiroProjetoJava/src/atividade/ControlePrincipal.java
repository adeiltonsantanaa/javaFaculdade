package atividade;

public class ControlePrincipal {

	public static void main(String[] args) {
		
		Controle c1 = new Controle();
		c1.setMarca("Samsung");
		c1.setCor("Azul");
		c1.setLigado(true);
		c1.setQtd_botoes(17);
		c1.status();
		
		Controle c2 = new Controle();
		c2.setMarca("PlayStation");
		c2.setCor("Cinza");
		c2.setLigado(false);
		c2.setQtd_botoes(18);
		c2.ligar();
		c2.status();

	}

}
