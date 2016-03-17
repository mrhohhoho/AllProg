package dz3;

public class Human {
	private String FirsName;
	private String LastName;
	private String Sex;
	private int Age;
	
	public Human(String firsName, String lastName, String sex, int age) {
		super();
		FirsName = firsName;
		LastName = lastName;
		Sex = sex;
		Age = age;
	}

	public String getFirsName() {
		return FirsName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getSex() {
		return Sex;
	}

	public int getAge() {
		return Age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-----------------");
		builder.append(System.lineSeparator());
		builder.append("FirsName: ");
		builder.append(FirsName);
		builder.append("; LastName: ");
		builder.append(LastName);
		builder.append("; Sex: ");
		builder.append(Sex);
		builder.append("; Age: ");
		builder.append(Age);
		builder.append(System.lineSeparator());
		builder.append("------------------------");
		builder.append(System.lineSeparator());
		return builder.toString();
	}
	
	
	
}
