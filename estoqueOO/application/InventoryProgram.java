package application;

import java.util.Locale;
import java.util.Scanner;

import entitiesDois.Inventory;

public class InventoryProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Inventory p1 = new Inventory();
		
		p1.setName("TV");
		p1.setPrice(900.00);
		p1.setQuantity(10);
		p1.status();
		System.out.println(p1);
		
		
		System.out.print("Entre com a quantidade de produtos que deseja adicionar no estoque:");
		p1.addProducts(sc.nextInt());
		System.out.print("Entre com a quantidade de produtos que deseja remover do estoque:");
		p1.removeProducts(sc.nextInt());
		
		p1.status();
		
		sc.close();
	}

}
