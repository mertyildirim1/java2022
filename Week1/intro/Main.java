package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		//De�i�ken isimlendirmeleri java'da camelCase yaz�l�r.
		String ortaMetin = "ilginizi �ekebilir";
		String altMetin = "Vade s�resi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDu�tuMu = true;
		
		String okYonu = "";
		
		if (dolarBugun < dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);			
		} else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);	
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//---------------------------------------------------------------
		//Array
		
		String[] krediler = {"H�zl� kredi", "Kredi X", "Kredi Y"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		for	(String kredi : krediler) {
			System.out.println("----");
			System.out.println(kredi);
		}
	}

}
