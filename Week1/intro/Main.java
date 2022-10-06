package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		//Deðiþken isimlendirmeleri java'da camelCase yazýlýr.
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun = 18.20;
		double dolarBugun = 18.20;
		
		boolean dolarDuþtuMu = true;
		
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
		
		String[] krediler = {"Hýzlý kredi", "Kredi X", "Kredi Y"};
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		for	(String kredi : krediler) {
			System.out.println("----");
			System.out.println(kredi);
		}
	}

}
