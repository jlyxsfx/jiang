package geometry;

public class Shape {
	protected String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public double area() {
		return 0.0;
	}
	
	public double perimeter() {
		return 0.0;
	}
	
	public String toString() {
		return "Shape, Farbe: " + color;
	}
}