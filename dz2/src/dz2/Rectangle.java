package dz2;

public class Rectangle extends Shape{

	private Point a;
	private Point b;
	private Point c;
	private Point d;
	
	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
		if(a!=b && b!=c && c!=d && a!=d) {
			System.out.println("Прямоугольник создан");
		} else System.out.println("По заданым точкам прямоугольник не может быть создан");
		}

	@Override
	double perimetr() {
		double P=0;
		P=a.length(b)+b.length(c)+c.length(d)+d.length(a);
		System.out.println("Периметр прямоугольника равен: "+P);
		return P;
	}

	@Override
	double area() {
		double S=0;
		S=a.length(b)+b.length(c);
		System.out.println("Площадь прямоугольника равна: "+S);
		return S;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetr()=" + perimetr() + ", area()=" + area() + "]";
	}
	
	
}
