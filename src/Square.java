
public class Square extends TwoDimensionalShape{
	
	private double edge;
	public Square(String name,double edge) {
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
		return getEdge()*getEdge();
	}
	@Override
	public String toString() {
		return super.toString()+" My name is "+getName()+"\nI have a edge and this edge is "+getEdge()+"\nMy area is "+getArea();
	}

}
