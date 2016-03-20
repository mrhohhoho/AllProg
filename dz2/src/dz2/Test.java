package dz2;

public class Test {

	public static void main(String[] args) {
		Desktop d = new Desktop("board");
		
		Point one = new Point(1, 1);
		Point two = new Point(1, 4);
		Point thre = new Point(4, 2);
		Point four = new Point(3, 5);
		Point five = new Point(5, 4);
		Point six = new Point(5, 1);
		
		Triangle tr = new Triangle(one, two, thre);
		Triangle tr1 = new Triangle(one, two, four);
		Circle cr = new Circle(one, thre);
		Rectangle rc = new Rectangle(one, two, thre, four);
		Rectangle rc1 = new Rectangle(one, two, five, six);
		
		tr.perimetr();
		tr.area();
		tr1.perimetr();
		tr1.area();
		cr.perimetr();
		cr.area();
		rc.perimetr();
		rc.area();
		rc1.perimetr();
		rc1.area();
		
		d.addShape(tr);
		d.addShape(tr1);
		d.addShape(cr);
		d.addShape(rc);
		d.removeShape();
		d.addShape(rc1);
		
		System.out.println(d);
	}

}
