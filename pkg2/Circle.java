package pkg2;


public class Circle implements Resizable {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void resize(double radius) {	
		this.radius=radius;
	}
	
	public static void main(String[] args) {
		Resizable res1 = new Circle(20.0);
		System.out.println("Original Radius : "+res1.getRadius());
		res1.resize(30.0);
		System.out.println("Resized Radius : "+res1.getRadius());

	}

}
