
public abstract class TwoDimensionalShape extends Shape {

	public TwoDimensionalShape(String name) {
		super(name);
	}
	
	public abstract double getArea();
	
	
	
	public String toString() {
		return super.toString()+" but two dimensional";
	}

}
