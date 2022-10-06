package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

	}

}
