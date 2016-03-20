package dz2;

import java.util.Scanner;

public class Desktop {
	private String name;
	public Shape [] Area = new Shape [4];
	
	public Desktop(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addShape (Shape shape){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of 1 to 4, where to put a figure");
		do
		i = sc.nextInt();
		while(i<1 || i>4);
		if (Area[i-1]==null) {
			Area[i-1]=shape;
			System.out.println(shape);
		}
		else System.out.println("The area occupied by another piece, at first it need to remove");

	}
	
	public void removeShape (){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the area of 1 to 4 to remove the figure from");
		do
		i = sc.nextInt();
		while(i<1 || i>4);
		if (Area[i-1]!=null) {
			Area[i-1]=null;
			System.out.println("The area is clear");
		} else System.out.println("This area is empty");
	}

	@Override
	public String toString() {
		double area=0;
		StringBuilder str = new StringBuilder();
		str.append("---------------------------------");
		str.append("Desktop ").append(this.name).append(System.lineSeparator());
		str.append(System.lineSeparator());
		
		for (int i=0; i<Area.length; i++){

			str.append(i + 1).append(')');
			if (Area[i] != null) {
				str.append(Area[i]);
				area =area + Area[i].area();
			} else {
				str.append("Empty");
			}
			str.append(System.lineSeparator());
		}
		str.append(System.lineSeparator());
		str.append("The total area is = ").append(area);
		str.append(System.lineSeparator());
		str.append("---------------------------------");
		return str.toString();
		}
		
		
}
