package pkg2;

public class Main {

	public static void main(String[] args) {
		Resizable res1 = new ResizableCircle(20.0);
		System.out.println("Original Radius : "+res1.getRadius());
		res1.resize(30.0);
		System.out.println("Resized Radius : "+res1.getRadius());
		

	}

}
