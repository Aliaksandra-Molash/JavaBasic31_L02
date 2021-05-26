package by.epam.unit03.main;

public class Task2 {
	public static void main (String[] args) { 
		// С помощью оператора while напишите программу определения суммы всех
		// нечетных чисел в диапазоне от 1 до 99 включительно.
		
		int x,sum;

        x = 1;
        sum = 0;
        while(x <= 99){
            if(x %2 !=0)
                sum += x;
            x++;
        }

        System.out.println("Сумма нечетных чисел от 1 до 99 = " +sum);
		
		
	}
}
