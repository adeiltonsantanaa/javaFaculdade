package entitiesDois;

public class Inventory {
	private String name;
	private double price;
	private int quantity;

	public void status() {
		System.out.println("--------------------------------------");
		System.out.println("Name: " + getName());
		System.out.println("Price: " + getPrice());
		System.out.println("Quantity: " + getQuantity());
		System.out.println("O total é de: " + totalValueInStock());
	}
	
	public double totalValueInStock() {
		double total = this.getQuantity() * this.getPrice();
		return total;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String toString() {
		return name
		+", $"
		+ String.format("%.2f", getPrice())
		+", "
		+ getQuantity()
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		
		
		
	}

}

