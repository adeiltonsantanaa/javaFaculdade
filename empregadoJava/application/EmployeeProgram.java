package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		// 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Digite o Nome, salario e taxa respectivamente: ");
		e1.setName(sc.next());
		e1.setGrossSalary(sc.nextDouble());
		e1.setTax(sc.nextDouble());
		e1.status();
		System.out.println("\nDigite a % de aumento: ");
		e1.increaseSalary(sc.nextDouble());

		
		
		
		
		
		sc.close();
	}

}
