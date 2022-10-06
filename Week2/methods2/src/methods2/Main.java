package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(1,2,5,6,3);
		System.out.println(toplam);
	}

	// fonksiyon yazarak kendimizi tekrarlamayý önlemiþ oluyoruz
	// DRY
	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) { // int... --> bu üç nokta kullanýmýna "veriable arguments" denir. ister 1 tane ister 100 tane deðer gönderebiliriz. int[] gibi düþünülebilir.
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
}
