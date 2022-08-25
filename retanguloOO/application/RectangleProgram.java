package application;

import java.util.Locale;
import java.util.Scanner;

import entitiesTres.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Rectangle r1 = new Rectangle();
		System.out.println("Enter rectangle widht and height: ");
		r1.setHeight(sc.nextInt());
		r1.setWidht(sc.nextInt());
		//r1.setHeight();
		//r1.setWidht();
		System.out.println(r1);

		
		sc.close();
	}

}
