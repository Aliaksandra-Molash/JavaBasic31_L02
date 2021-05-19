package by.epam.unit02.main;

public class Task4 {
	public static void main (String[] args) { 
		//Вычислить расстояние между двумя точками
		
		int x1, x2, y1, y2;
		double dist; 
		
		x1 = 2;
		x2 = -4;
		y1 = 2;
		y2 = -4;
		
		dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		
		System.out.println("Расстояние между двумя точками = " + dist);
					
			
	}

}
