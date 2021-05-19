package by.epam.unit02.main;

public class Task2 {

	public static void main(String[] args) {
		//Перераспределить значения переменных х и у
		
		int x, y, max ; 
		x = 7;
        y = 77;
             
        if (x > y) {
        	max = x ;
        	x = y ;
        	y = max ;
        	
        } else {
        	max = y; 
        	y = x; 
        	x = max ;
        	
        }
        
        System.out.println("x: " + x + " y: " + y);	
	}

	}
