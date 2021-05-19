package by.epam.unit02.main;

public class Task7 {
	public static void main (String[] args) {
		//Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
		
		int a = -12565;
        int b = 0;
        int c = 6;
        
        if (a >= 0) {
            a = (int) Math.pow(a, 2);
         
        } else {
            a = (int) Math.pow(a, 4);
         }

        if (b >= 0) {
            b = (int) Math.pow(b, 2);
            
        } else {
            b = (int) Math.pow(b, 4);
        }

        if (c >= 0) {
            c = (int) Math.pow(c, 2);
        } else {
            c = (int) Math.pow(c, 4);
        }
       
        System.out.println("Результат для a " + a);
        System.out.println("Результат для b " + b);
        System.out.println("Результат для c " + c);
	}

}
