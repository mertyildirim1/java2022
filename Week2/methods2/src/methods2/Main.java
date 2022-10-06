package methods2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(1,2,5,6,3);
		System.out.println(toplam);
	}

	// fonksiyon yazarak kendimizi tekrarlamay� �nlemi� oluyoruz
	// DRY
	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void g�ncelle() {
		System.out.println("G�ncellendi");
	}

	public static String sehirVer() {
		return "Ankara";
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) { // int... --> bu �� nokta kullan�m�na "veriable arguments" denir. ister 1 tane ister 100 tane de�er g�nderebiliriz. int[] gibi d���n�lebilir.
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
}
