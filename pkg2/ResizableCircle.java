package pkg2;


public class ResizableCircle implements Resizable {
	double radius;
	public ResizableCircle(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void resize(double radius) {	
		this.radius=radius;
	}
	

}
