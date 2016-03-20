package dz_1_5;

import java.util.ArrayList;

public class Operator {
	private String name;
	private ArrayList <Long> ContactList = new ArrayList<Long>();
	
	public Operator(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Long> getContactList() {
		return ContactList;
	}

	public void addPhone (phone a){
		
		ContactList.add(a.getNumber());
	}

	@Override
	public String toString() {
		return "Operator [name=" + name + ", ContactList=" + ContactList + "]";
	}
	
	//public void calling(phone a){
	//	if (ContactList.contains(a.getNumber())) System.out.println("calling"); 
	//	else System.out.println("This number is not valid");
	//}
}
