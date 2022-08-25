package entitiesTres;

public class Rectangle {
	
	private double widht;
	private double height;
	
	public double area() {
		return getWidht() * getHeight();
	}
	
	public double perimeter() {
		return (getHeight() + getWidht()) * 2;
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(getWidht(), 2) + Math.pow(getHeight(), 2));
	}
	
	//GETTER E SETTER
	public double getWidht() {
		return widht;
	}
	public void setWidht(double widht) {
		this.widht = widht;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String toString() {
		return "AREA = " + String.format("%.2f\n", area())
		+ "PERIMETER = " + String.format("%.2f\n", perimeter())
		+ "DIAGONAL = " + String.format("%.2f", diagonal());
				
	}
	
	
	
	
	
	
}
