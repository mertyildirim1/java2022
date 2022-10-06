package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel."; // Stringler karakter dizisidir.
		System.out.println(mesaj);
		
		
		/*
		System.out.println("Eleman say�s� :" + mesaj.length());
		System.out.println("5. Eleman :" + mesaj.charAt(4)); // metindeki 4. indexteki yani 5. eleman� bize verir
		System.out.println(mesaj.concat(" Ya�as�n!")); // concatenation'dan gelir birle�tirmek anlam�na gelir
		System.out.println(mesaj.startsWith("B"));// startsWith boolean de�er d�nd�r�r. e�er mesaj 'B' ile ba�l�yosa "true" d�nd�r�r, ba�lam�yosa "false" d�nd�r�r
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//yo�un kullan�l�r
		System.out.println(mesaj.indexOf('a')); // bu method mesaj�n i�indeki ka��nc� eleman oldu�unu bulmaya yarar. ilk buldu�u 'a'y� verir ve operasyonu bitirir
		System.out.println(mesaj.lastIndexOf('a')); //bu method ise sa�dan aramaya ba�lar ilk harfi veya metini bulunca index numaras�n� ona g�re verir 
		*/
		
		
		//**NOT**--> string fonksiyonlar�n hemen hemen tamam� ilgili metnin kendisini de�i�tirmez, yeni bir ��kt�-metin �retir
		//bu methodu yeni bir de�i�kene de atayabiliriz b�ylelikle istedi�imiz yerde kullanabiliriz.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.replace(' ', '-')); //replace -- de�i�tirmek. ---> bu kullan�m oldu�u yerde ge�erlidir mesaj�n kendisini de�i�tirmez 
	
		System.out.println(mesaj.substring(2));//Ka��nc� index'den itibaren alay�m.
		System.out.println(mesaj.substring(2, 5));//ka��nc� indexten ka��nc� indexe kadar alay�m. 5.index dahil de�ildir.
		
		for(String kelime:mesaj.split(" ")) {//split -- olduk�a kullan��l�d�r. kelimeleri bo�luklara g�re b�ler
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //toLowerCase --> k���k harf demek. Mesaj� k���k harfe �evirir
		System.out.println(mesaj.toUpperCase()); //toUpperCase --> b�y�k harf demek. Mesaj� b�y�k harfe �evirir
		
		System.out.println(mesaj.trim()); //veri ba�ka bir kaynaktan geldi�inde d�zensiz, ba��nda, sonunda bo�luk olabiliyor. "trim()" -- k�rpmak demektir. Mesaj� d�zenler/k�rpar.
	}

}
