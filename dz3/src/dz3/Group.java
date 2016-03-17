package dz3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Group {
	private Student[] StGroup= new Student[10];
	
	public void addStudent(Student b){
		        try {
		for(int i=0; i<StGroup.length; i++){
			if(StGroup[i]==null) {
				StGroup[i]=b;
				System.out.print(i+1+")");
				System.out.println(StGroup[i]);
				return;
				} 
		}  
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Group is full");
		}
	}
	
	public boolean search() {
		boolean a = false;
		int count=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input the Last Name for search: \r");
		String lastName = "";
		try {
			lastName = reader.readLine();
		} catch (IOException e) {
				e.printStackTrace();
		}
	        for (int i = 0; i < StGroup.length; i++) {
            if (lastName.equals(StGroup[i].getLastName())) {
                System.out.println(StGroup[i]);
                a = true;
            } if (!lastName.equals(StGroup[i].getLastName())) {
            	count++;
            	if (count==10) System.out.print("This Last Name not found");
            }
        } 
        
        return a;
        }
}
