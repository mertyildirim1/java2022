package methodOverloading;

public class DortIslem {

	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	// method overloading
	// imzalar ayn� fakat parametreler farkl�
	public int Topla(int sayi1, int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
}
