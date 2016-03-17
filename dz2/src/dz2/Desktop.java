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
		System.out.println("Введите область от 1 до 4 куда поместить фигуру");
		do
		i = sc.nextInt();
		while(i<1 || i>4);
		if (Area[i-1]==null) {
			Area[i-1]=shape;
			System.out.println(shape);
		}
		else System.out.println("Область занята другой фигурой, сначала ее нужно удалить");
		
	}
	
	public void removeShape (){
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите область от 1 до 4 откуда удалить фигуру");
		do
		i = sc.nextInt();
		while(i<1 || i>4);
		if (Area[i-1]!=null) {
			Area[i-1]=null;
			System.out.println("Область освобождена");
		} else System.out.println("Данная область пуста");
	}

	@Override
	public String toString() {
		double area=0;
		StringBuilder str = new StringBuilder();
		str.append("---------------------------------");
		str.append("Доска ").append(this.name).append(System.lineSeparator());
		str.append(System.lineSeparator());
		
		for (int i=0; i<Area.length; i++){

			str.append(i + 1).append(')');
			if (Area[i] != null) {
				str.append(Area[i]);
				area =area + Area[i].area();
			} else {
				str.append("Свободно");
			}
			str.append(System.lineSeparator());
		}
		str.append(System.lineSeparator());
		str.append("Общая площадь равна = ").append(area);
		str.append(System.lineSeparator());
		str.append("---------------------------------");
		return str.toString();
		}
		
		
}
