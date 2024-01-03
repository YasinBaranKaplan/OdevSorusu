
public class Cube extends ThreeDimensionalShape{
	private double edge;
	
	public Cube(String name,double edge) {
		super(name);
		this.edge=edge;
		// TODO Auto-generated constructor stub
	}
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getEdge()*getEdge()*6;
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return getEdge()*getEdge()*getEdge();
	}
	
	public String toString() {
		return super.toString()+"My area is "+getArea()+"\nMy volume is "+getVolume();
	}
	
	

}
