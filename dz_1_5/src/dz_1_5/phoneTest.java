package dz_1_5;

public class phoneTest {

	public static void main(String[] args) {
		Operator one = new Operator("Kyivstar");
		phone a = new phone ("Vasya", 804452245);
		phone d = new phone ("Misha", 809634225, one);
		phone c = new phone ("Petya", 809633225);
		phone b = new phone ("Sasha", 809333333);
		
		
		one.addPhone(a);
		one.addPhone(c);
		//one.addPhone(b);
		one.addPhone(d);
		
		a.registr(one);
		a.calling(d);
		a.calling(c);
		a.calling(b);
		//d.registr(one);
		d.calling(a);
		System.out.println(one);
	}

}
