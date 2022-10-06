package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Mert";
		String ogrenci2 = "Merve";
		String ogrenci3 = "Tu��e";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("---------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Mert";
		ogrenciler[1] = "Merve";
		ogrenciler[2] = "Tu��e";
		ogrenciler[3] = "�zlem";	
		//ogrenciler[4] = "Aleyna";
		
		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);
		}
		
		//di�er bir kullan�m - genelde bu y�ntem dizlerde daha �ok kullan�l�r.
		for(String ogrenci:ogrenciler) //��renciler dizisindeki her bir eleman�(ogrenci) gez
		{
			System.out.println(ogrenci);
		}

	}

}
