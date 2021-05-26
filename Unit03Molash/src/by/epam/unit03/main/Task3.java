package by.epam.unit03.main;

public class Task3 {
	public static void main (String[] args) { 
		//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
		
		int sum;
		long x; 
		double i; 
		
		sum = 3;
		x = sum;
		
		for(i = 3; i <= 10; i++) {

			sum = (int) (sum + i);
			x = x * sum;	
		}

		System.out.println("Результат вычисления равен " + x);
	}
}

