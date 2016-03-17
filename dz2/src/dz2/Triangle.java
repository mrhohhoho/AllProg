package dz2;

public class Triangle extends Shape{
	
	private Point a;
	private Point b;
	private Point c;
		
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
				
		if(a != b && a != c && b != c) {
			 
			System.out.println("Треуголник создан");
			} else { 
			System.out.println("Треугольник не может быть создан");
			}
		} 
	
	
	@Override
	double perimetr() {
							
			double P=0;
			P= a.length(b)+b.length(c)+c.length(a);
			System.out.println("Периметр треугольника равен: "+P);
			return P;
					
	}

	@Override
	double area() {
		double P=0, S=0;
		P= a.length(b)+b.length(c)+c.length(a);
		
		S=Math.sqrt(P*(P-a.length(b))*(P-b.length(c))*(P-c.length(a)));
		
		System.out.println("Площадь треугольника равна: "+S);
		return S;
	}

	@Override
	public String toString() {
		return "Triangle [perimetr()=" + perimetr() + ", area()=" + area() + "]";
	}
	

}
