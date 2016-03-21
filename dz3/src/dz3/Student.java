package dz3;

public class Student extends Human implements Comparable{
	private static String STATUS = "Student";

	public Student(String firsName, String lastName, String sex, int age) {
		super(firsName, lastName, sex, age);
		}

	@Override
	public String toString() {
		return STATUS + super.toString();
	}

	@Override
	public int compareTo(Object o) {
		Student s=(Student) o;
		if (this.getLastName().charAt(0)>s.getLastName().charAt(0)){
				return 1;
		} else if (this.getLastName().charAt(0)<s.getLastName().charAt(0)){
		    return -1;
		} else {
			return 0;
		}
	}

	
	
	
}
