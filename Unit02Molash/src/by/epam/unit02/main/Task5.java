package by.epam.unit02.main;

public class Task5 {
	public static void main (String[] args) {
		//Вычислить значение выражения по формуле
		
		double x, y, result; 
		
		x = 3.5;
		y = 5.3;
		
		result = ((Math.sin(x) + Math.cos(x)) / (Math.cos(x) - Math.sin(x))) * Math.tan(x * y);
		
		System.out.println("Значение выражения = " + result);
				
	}

}
