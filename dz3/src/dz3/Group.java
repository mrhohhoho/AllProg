package dz3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
	        	try {
            if (lastName.equals(StGroup[i].getLastName())) {
                System.out.println(StGroup[i]);
                a = true;
            } if (!lastName.equals(StGroup[i].getLastName())) {
            	count++;
            	if (count==10) System.out.print("This Last Name not found");
            }}
            catch (NullPointerException e){
            	System.out.println("Группа не полная");
            }
        } 
        
        return a;
	}
	
	public void addInStudent(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String firsName = "";
		System.out.print("Please enter the Student's Firs Name : \r");
		try {
			firsName = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String lastName = "";
		System.out.print("Please enter the Student's Last Name : \r");
		try {
			lastName = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sex = "";
		System.out.print("Please enter the Student's sex : \r");
		try {
			sex = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String ageS = "";
		int age = 0;
		System.out.print("Please enter the Student's age : \r");
		while (true) {
		try {
			ageS = reader.readLine();
			
		} catch (IOException e) 
			{
			System.out.println(e);
			}
		try {
		age = Integer.parseInt(ageS);
		break;
			} 
		catch (NumberFormatException e) 
			{
			System.out.println("Enter a number");
			}
		}	
		
		Student addInt = new Student(firsName, lastName, sex, age); 

		try {
			for(int i=0; i<StGroup.length; i++){
				if(StGroup[i]==null) {
					StGroup[i]=addInt;
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
	
		
	
	public void sortGroup() {
		
		Arrays.sort(StGroup);
		System.out.println("Сортировка выполнена.");
		System.out.println(StGroup);
		System.out.println();
		for (int i = 0; i < StGroup.length; i++) {
        	
          System.out.println(StGroup[i]);
		}
        
		
		
	}
}
