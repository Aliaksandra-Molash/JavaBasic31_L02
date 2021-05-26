package by.epam.unit03.main;

public class Task1 {
	public static void main (String[] args) {
	// Необходимо вывести на экран таблицу умножения на 3.
	
	int x, n, r; 
	
	n = 1;
	x = 3;
    
     while (n <= 10) {
         r = x * n;
         
         System.out.println ("3 *" + ' ' + n + " =" + ' ' + r);
         n++;
     }
}
}