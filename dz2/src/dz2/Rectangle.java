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
			System.out.println("������������� ������");
		} else System.out.println("�� ������� ������ ������������� �� ����� ���� ������");
		}

	@Override
	double perimetr() {
		double P=0;
		P=a.length(b)+b.length(c)+c.length(d)+d.length(a);
		System.out.println("�������� �������������� �����: "+P);
		return P;
	}

	@Override
	double area() {
		double S=0;
		S=a.length(b)+b.length(c);
		System.out.println("������� �������������� �����: "+S);
		return S;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetr()=" + perimetr() + ", area()=" + area() + "]";
	}
	
	
}
