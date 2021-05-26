package by.epam.unit02.main;

public class Task9 {
		public static void main(String[] args) {
		
		//Вычислить значение функции
		
		int x = 36;
		double fx;
		
		if(x <= -3) {
			fx = 9;
		} else if (x > 3) {
			fx = 1 / (Math.pow(x, 2) + 1);
		}	else {
				return;
			}
	
		System.out.println("Результат = " + fx);
		
		}// Молодец
	}
		

