package recapDemo1;

public class Main {

	public static void main(String[] args) {
		
		//En b�y�k say�y� bulma
		
		int sayi1 = 20;
		int sayi2 = 22;
		int sayi3 = 2;
		
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En b�y�k :" + enBuyuk);
	}

}
