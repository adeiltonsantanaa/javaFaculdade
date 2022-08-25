package entities;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	
	//METODOS
	public double netSalary() {
		grossSalary -= tax;
		return grossSalary;
	}
	public void increaseSalary(double percentage) {
		double aux = 0;
		double aux2 = grossSalary + tax;
		aux = ((percentage / 100) * aux2);
		this.grossSalary += aux;
		System.out.printf("\nUpdate Data: %.2f", grossSalary);
		
		
	}
	public void status() {
		System.out.println("Name: " + name);
		System.out.println(String.format("Gross salary: $%.2f", grossSalary));
		System.out.println(String.format("Tax: $%.2f", tax));
		System.out.printf("Employee: %s, $%.2f", name, netSalary());
	}
	//GETTERS SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
