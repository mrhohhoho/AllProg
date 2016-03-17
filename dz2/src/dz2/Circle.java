package dz2;

public class Circle extends Shape{
	
	private Point centr;
	private Point point;
	
	
	
	public Circle(Point centr, Point point) {
		super();
		this.centr = centr;
		this.point = point;
				
		if (centr!=point){
			
			System.out.println("���� ������");
		} else System.out.println("������� ������ �����");
	}

	@Override
	double perimetr() {
		double radius=0, P=0;
		radius = Math.sqrt(Math.pow((centr.getX()-point.getX()), 2)+Math.pow((centr.getY()-point.getY()), 2));
		P = 2*Math.PI*radius;
		System.out.println("�������� ����� �����: "+P);
		return P;
	}

	@Override
	double area() {
		double radius=0, S=0;
		radius = Math.sqrt(Math.pow((centr.getX()-point.getX()), 2)+Math.pow((centr.getY()-point.getY()), 2));
		S = Math.PI*Math.pow(radius, 2);
		System.out.println("������� ����� �����: "+S);
		return S;
	}

	@Override
	public String toString() {
		return "Circle [perimetr()=" + perimetr() + ", area()=" + area() + "]";
	}

}
