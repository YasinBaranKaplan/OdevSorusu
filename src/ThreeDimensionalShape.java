
public abstract class ThreeDimensionalShape extends Shape{

	public ThreeDimensionalShape(String name) {
		super(name);
	}
	
	public abstract double getArea();
	public abstract double getVolume();
	
	@Override
	public String toString() {
		return super.toString()+" but three dimensional shape\nI have a area and volume\n";
	}

}
