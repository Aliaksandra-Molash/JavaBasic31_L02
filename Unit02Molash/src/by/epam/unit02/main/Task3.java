package by.epam.unit02.main;

public class Task3 {
	public static void main (String[] args) {
		//Вывести значение в следующей форме: ННч ММмин SSc
		
		int hour, min, sec, T;
		T = 6789;
						
		hour = T / 3600;
		T = T - hour * 3600;
		min = T / 60;
		T = T - min * 60;
		sec = T;
		
		System.out.println("HH" + hour + " MM" + min + " SS" + sec);  
	}
}
