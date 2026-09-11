package geometry;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return String.format(
		"Kreis, Farbe: %s, Radius: %.2f, Flaeche: %.2f",
		color, radius, area()
		);
	}
}