package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 4, 5, 6, 9, 0 };
		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Say� mevcuttur");
		} else {
			System.out.println("Say� mevcut de�ildir");
		}

	}

}
