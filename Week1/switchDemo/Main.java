package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel : Ge�tiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi : Ge�tiniz");
			break;
		case 'D':
			System.out.println("Fena de�il : Ge�tiniz");
			break;
		case 'F':
			System.out.println("Maalesef kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz");
		}

	}

}
