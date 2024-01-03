
public class Circle extends TwoDimensionalShape {
	
	private double radius;
	protected double pi = Math.PI;
	public Circle(String name,double radius) {
		super(name);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi*getRadius()*getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return super.toString()+" My name is "+getName()+"\nI have a radius and this radius is "+getRadius()+"\nMy area is "+getArea();
	}

}
