package Circle;

public class CircleCircle {
	private double radius;
	
	
	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	

	public CircleCircle(double radius) {
		
		this.radius = radius;
	}


	public void calculateArea() {
		final double PI = 3.141509;
		
		double aria = PI * Math.sqrt(radius);
		
		System.out.println("aria = " + aria);
		
	}

}
