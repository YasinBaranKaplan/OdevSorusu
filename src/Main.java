
public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape("Shape");
		System.out.println(shape.toString());
		System.out.println();
		
		
		Square sqr =new Square("Kare", 5);
		System.out.println(sqr.toString());
		System.out.println();
		
		Circle crc = new Circle("Daire", 7);
		System.out.println(crc.toString());
		System.out.println();
		
		Triangle trng = new Triangle("Üçgen",3, 4);
		System.out.println(trng.toString()); 
		System.out.println();
		
		Cube cube = new Cube("Küp", 3);
		System.out.println(cube.toString());
		System.out.println();
		
		Sphere sph = new Sphere("Küre", 4);
		System.out.println(sph.toString());
		System.out.println();
		
		 
	}

}
