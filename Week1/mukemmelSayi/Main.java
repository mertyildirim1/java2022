package mukemmelSayi;


public class Main {

	public static void main(String[] args) {
		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i;
				
			}
		}
		if(total == number) {
			System.out.println("M�kemmel say�d�r");
		}else {
			System.out.println("M�kemmel say� de�ildir");
		}

	}

}
