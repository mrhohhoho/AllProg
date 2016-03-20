package dz2;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double length (Point b){
		double leng = Math.sqrt(Math.pow((this.getX()-b.getX()),2)+Math.pow((this.getY()-b.getY()),2));
		return leng;
		
	}
}
