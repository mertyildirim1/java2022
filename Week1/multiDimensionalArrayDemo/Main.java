package multiDimensionalArrayDemo;


public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3]; // 3 sat�r ve 3 s�tundan olu�an �ok bouytlu bir dizi olu�turduk

		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "�anl�urfa";
		sehirler[2][1] = "Diyarbak�r";
		sehirler[2][2] = "Gaziantep";
		
		// nasted loop - i� i�e d�ng�
		for(int i = 0; i<=2; i++) {
			System.out.println("-----------");
			for(int j = 0; j<=2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

		

	}

}
