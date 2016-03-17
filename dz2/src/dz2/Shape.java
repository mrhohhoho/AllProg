package dz2;

public abstract class Shape {
	double S;
	abstract double perimetr();
	abstract double area();
	
	public double getS() {
		return S;
	}
	@Override
	public String toString() {
		return "Shape :";
	}
	
	
}
