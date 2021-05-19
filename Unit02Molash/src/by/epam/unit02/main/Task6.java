package by.epam.unit02.main;

public class Task6 {
	public static void main (String[] args) {
		//Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
		
		int M, N, older, young;
		double result; 
		
		M = 897;
        N = 67;
        
        result = (double) M / N;
        
        young = (int) (result % 10);
        older = (int) ((result * 10) % 10);
        System.out.println("Результат = " + result);
        System.out.println("Младшая цифра = " + young);
        System.out.println("Старшая цифра = " + older);
        	
	}

}
