package dz3;

public class Test {

	public static void main(String[] args) {
		Student one = new Student("Vasya", "Pupkin", "male", 22);
		Student two = new Student("Petya", "Pyatochkin", "male", 24);
		Student thre = new Student("Sasha", "Vasilyuk", "male", 26);
		Student four = new Student("Maksim", "Dron", "male", 27);
		Student five = new Student("Ivan", "Dorn", "male", 27);
		Student six = new Student("Masha", "Medvedeva", "female", 20);
		Student seven = new Student("Vova", "Bubin", "male", 35);
		Student eight = new Student("Anna", "Li", "female", 28);
		Student nine = new Student("Anton", "Chechov", "male", 40);
		Student ten = new Student("Sasha", "Grey", "female", 30);
		Student eleven = new Student("Aretem", "Mukiv", "male", 29);
		Student twelve = new Student("Yaroslav", "Beletskiy", "male", 38);
		
		Group a = new Group();
		
		a.addStudent(one);
		a.addStudent(two);
		a.addStudent(four);
		a.addStudent(thre);
		a.addStudent(ten);
		a.addStudent(nine);
		a.addStudent(eight);
		a.addStudent(seven);
		a.addStudent(six);
		a.addStudent(five);
		a.addStudent(eleven);
		a.addStudent(twelve);
		
		a.search();
		

	}

}
