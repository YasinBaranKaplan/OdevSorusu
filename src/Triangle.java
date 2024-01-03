
public class Triangle extends TwoDimensionalShape {
	
	private double base,height;

	public Triangle(String name,double base,double height) {
		super(name);
		this.base=base;
		this.height=height;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getBase()*getHeight()/2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return super.getName()+" My name is "+getName()+
				"\nI have a two important lenght\nFirst one is base ant this is "+getBase()+
					"\nSecond one is height for my area and second one is "+getHeight()+"\nMy area is " + getArea();
		
	}

}
