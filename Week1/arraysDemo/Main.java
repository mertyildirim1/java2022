package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Mert";
		String ogrenci2 = "Merve";
		String ogrenci3 = "Tuðçe";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("---------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Mert";
		ogrenciler[1] = "Merve";
		ogrenciler[2] = "Tuðçe";
		ogrenciler[3] = "Özlem";	
		//ogrenciler[4] = "Aleyna";
		
		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);
		}
		
		//diðer bir kullaným - genelde bu yöntem dizlerde daha çok kullanýlýr.
		for(String ogrenci:ogrenciler) //öðrenciler dizisindeki her bir elemaný(ogrenci) gez
		{
			System.out.println(ogrenci);
		}

	}

}
