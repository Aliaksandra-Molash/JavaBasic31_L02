package by.epam.unit03.main;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
		
		int x, y, frx, fry, result, i, I; 
		
		 x = 987456;
		 y = 123456;
				
		for (i = y; i > 0; i = i/10) {
			frx = i%10;
   		
            		for (I = y; I > 0; I = I / 10) {
            			fry  = I%10;

            			if (frx == fry) {
            				result = frx;
            		
            				System.out.println("дублирующиеся цифры " + result);
	}
		}
		}
	}
}
