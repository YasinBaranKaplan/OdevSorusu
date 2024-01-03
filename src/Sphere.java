public class Sphere extends ThreeDimensionalShape {
	private double radius;
	protected double pi = Math.PI;
	public Sphere(String name,double radius) {
		super(name);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return 4*pi*getRadius()*getRadius() ;
	}

	@Override
	public double getVolume() {
		return (4/3)*pi*getRadius()*getRadius()*getRadius();
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String toString() {
		return super.toString()+"My area is "+getArea()+"\nMy volume is "+getVolume();
	}
	

}
