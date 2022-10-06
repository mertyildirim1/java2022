package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel."; // Stringler karakter dizisidir.
		System.out.println(mesaj);
		
		
		/*
		System.out.println("Eleman sayýsý :" + mesaj.length());
		System.out.println("5. Eleman :" + mesaj.charAt(4)); // metindeki 4. indexteki yani 5. elemaný bize verir
		System.out.println(mesaj.concat(" Yaþasýn!")); // concatenation'dan gelir birleþtirmek anlamýna gelir
		System.out.println(mesaj.startsWith("B"));// startsWith boolean deðer döndürür. eðer mesaj 'B' ile baþlýyosa "true" döndürür, baþlamýyosa "false" döndürür
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//yoðun kullanýlýr
		System.out.println(mesaj.indexOf('a')); // bu method mesajýn içindeki kaçýncý eleman olduðunu bulmaya yarar. ilk bulduðu 'a'yý verir ve operasyonu bitirir
		System.out.println(mesaj.lastIndexOf('a')); //bu method ise saðdan aramaya baþlar ilk harfi veya metini bulunca index numarasýný ona göre verir 
		*/
		
		
		//**NOT**--> string fonksiyonlarýn hemen hemen tamamý ilgili metnin kendisini deðiþtirmez, yeni bir çýktý-metin üretir
		//bu methodu yeni bir deðiþkene de atayabiliriz böylelikle istediðimiz yerde kullanabiliriz.
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.replace(' ', '-')); //replace -- deðiþtirmek. ---> bu kullaným olduðu yerde geçerlidir mesajýn kendisini deðiþtirmez 
	
		System.out.println(mesaj.substring(2));//Kaçýncý index'den itibaren alayým.
		System.out.println(mesaj.substring(2, 5));//kaçýncý indexten kaçýncý indexe kadar alayým. 5.index dahil deðildir.
		
		for(String kelime:mesaj.split(" ")) {//split -- oldukça kullanýþlýdýr. kelimeleri boþluklara göre böler
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //toLowerCase --> küçük harf demek. Mesajý küçük harfe çevirir
		System.out.println(mesaj.toUpperCase()); //toUpperCase --> büyük harf demek. Mesajý büyük harfe çevirir
		
		System.out.println(mesaj.trim()); //veri baþka bir kaynaktan geldiðinde düzensiz, baþýnda, sonunda boþluk olabiliyor. "trim()" -- kýrpmak demektir. Mesajý düzenler/kýrpar.
	}

}
