package dz3;

public class Student extends Human{
	private static String STATUS = "Student";

	public Student(String firsName, String lastName, String sex, int age) {
		super(firsName, lastName, sex, age);
		}

	@Override
	public String toString() {
		return STATUS + super.toString();
	}

	
	
	
}
