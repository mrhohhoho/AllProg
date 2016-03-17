package dz2;

public class Circle extends Shape{
	private double rad, P, S;
	public Point centr;
	public Point point;
	
	
	
	public Circle(Point centr, Point point) {
		super();
		this.centr = centr;
		this.point = point;
				
		if (centr!=point){
			rad = Math.sqrt(Math.pow((centr.getX()-point.getX()), 2)+Math.pow((centr.getY()-point.getY()), 2));
			System.out.println("Круг создан");
		} else System.out.println("Введите другие точки");
	}

	@Override
	double perimetr() {
		P = 2*Math.PI*rad;
		System.out.println("Периметр круга равен: "+P);
		return P;
	}

	@Override
	double area() {
		S = Math.PI*rad*rad;
		System.out.println("Площадь круга равна: "+S);
		return S;
	}

	@Override
	public String toString() {
		return "Circle [perimetr()=" + P + ", area()=" + S + "]";
	}

}
