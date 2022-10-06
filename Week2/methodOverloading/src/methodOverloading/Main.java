package methodOverloading;

public class Main {

	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(2, 3);

		System.out.println(sonuc);
		int sonuc2 = dortIslem.Topla(1, 2, 3);
		System.out.println(sonuc2);
	}

}
