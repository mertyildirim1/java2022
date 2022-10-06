package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulma();
		
	}
	
	public static void sayiBulma() {
		int[] sayilar = { 1, 2, 4, 6, 7, 9, 0 };
		int aranacak = 1;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
			}
		}

		// String mesaj = "";
		if (varMi) {
			// mesaj = "Sayý mevcuttur " + aranacak;
			// mesajVer(mesaj);
			mesajVer();
		} else {
			System.out.println("sayý mevcut deðildir " + aranacak);
		}

	}

	public static void mesajVer() {
		System.out.println("sayý mevcuttur");
	}

}
