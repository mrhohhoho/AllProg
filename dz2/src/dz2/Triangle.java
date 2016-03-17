package dz2;

public class Triangle extends Shape{
	private double S, P;
	private double ab;
	private double ac;
	private double bc;
	private boolean exist;
	public Point a;
	public Point b;
	public Point c;
		
	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		double abx=0, aby=0, acx=0, acy=0, bcx=0, bcy=0;
		
		if(a != b && a != c && b != c) {
			if(a.getX()>b.getX()) abx=Math.pow((a.getX()-b.getX()),2);
			if(b.getX()>a.getX()) abx=Math.pow((b.getX()-a.getX()),2);
			if(a.getY()>b.getY()) aby=Math.pow((a.getY()-b.getY()),2);
			if(b.getY()>a.getY()) aby=Math.pow((b.getY()-a.getY()),2);
			ab = Math.sqrt(abx+aby);
			
			if(a.getX()>c.getX()) acx=Math.pow((a.getX()-c.getX()),2);
			if(c.getX()>a.getX()) acx=Math.pow((c.getX()-a.getX()),2);
			if(a.getY()>c.getY()) acy=Math.pow((a.getY()-c.getY()),2);
			if(c.getY()>a.getY()) acy=Math.pow((c.getY()-a.getY()),2);
			ac = Math.sqrt(acx+acy);
			
			if(c.getX()>b.getX()) bcx=Math.pow((c.getX()-b.getX()),2);
			if(b.getX()>c.getX()) bcx=Math.pow((b.getX()-c.getX()),2);
			if(c.getY()>b.getY()) bcy=Math.pow((c.getY()-b.getY()),2);
			if(b.getY()>c.getY()) bcy=Math.pow((b.getY()-c.getY()),2);
			bc = Math.sqrt(bcx+bcy);
			
			if (ab<ac+bc && ac<ab+bc && bc<ab+ac)  { setExist(true);
			System.out.println("Треуголник создан");
			} else { setExist(false);
			System.out.println("Треугольник не может быть создан");
			}
		} 
	}
	
	public boolean isExist() {
		return exist;
	}

	public void setExist(boolean exist) {
		this.exist = exist;
	}

	@Override
	double perimetr() {
							
			if (isExist()==true) { P = ab+ac+bc;
			
			System.out.println("Периметр треугольника равен: "+P);
			return P;
			} else {
			System.out.println("Из заданных точек невозможнно построить треугольник");
			return 0;
		}
		
	}

	@Override
	double area() {
		double P=0;
		
		if (isExist()==true) { P = (ab+ac+bc)/2;
		S=Math.sqrt(P*(P-ab)*(P-ac)*(P-bc));
		
		System.out.println("Площадь треугольника равна: "+S);
		return S;
		} else {
		System.out.println("Из заданных точек невозможнно построить треугольник");
		return 0;
	}
	}

	@Override
	public String toString() {
		return "Triangle [exist=" + exist + ", perimetr()=" + P + ", area()=" + S + "]";
	}
	

}
