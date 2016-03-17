package dz2;

public class Rectangle extends Shape{
	private double S, P;
	private double ab, bc, cd, ad;
	public Point a;
	public Point b;
	public Point c;
	public Point d;
	
	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		
		if(a!=b && b!=c && c!=d && a.getX()==b.getX() && b.getY()==c.getY()
								&& c.getX()==d.getX() && a.getY()==d.getY()) {
			ab=b.getY()-a.getY();
			bc=c.getX()-b.getX();
			cd=ab;
			ad=bc;
			System.out.println("Прямоугольник создан");
		} else System.out.println("По заданым точкам прямоугольник не может быть создан");
		}

	@Override
	double perimetr() {
		P=ab+bc+cd+ad;
		System.out.println("Периметр прямоугольника равен: "+P);
		return P;
	}

	@Override
	double area() {
		S=ab*bc;
		System.out.println("Площадь прямоугольника равна: "+S);
		return S;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetr()=" + P + ", area()=" + S + "]";
	}
	
	
}
