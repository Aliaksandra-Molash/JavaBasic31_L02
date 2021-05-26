package by.epam.unit03.main;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Написать программу, переводящую римские цифры в арабские.
		
		String roman = "IVXLCDM";
		int arabic, i;
		char romanChar;

		char[] romanArray = roman.toCharArray();

		for (i = 0; i < roman.length(); i++) {
			romanChar = romanArray[i];

			switch (romanChar) {

			case 'I':
				arabic = 1;
				break;
			case 'V':
				arabic = 5;
				break;
			case 'X':
				arabic = 10;
				break;
			case 'L':
				arabic = 50;
				break;
			case 'C':
				arabic = 100;
				break;
			case 'D':
				arabic = 500;
				break;
			case 'M':
				arabic = 1000;
				break;

			default:
				System.out.println("ошибка");
				return;

			}

			System.out.println(romanChar + " = " + arabic);
		}
	}

}
