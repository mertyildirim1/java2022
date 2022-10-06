package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 2.5, 3.1, 6.3 };
		double total = 0;
		double max = myList[0];
		
		for (double number : myList) {
			total = total + number; //dizideki elemanlar�n toplam�n� bulma
			
			if (max < number) { //dizideki en b�y�k eleman� bulma
				max = number;
			}
			System.out.println(number);
		}
		System.out.println("Toplam :" + total);
		System.out.println("En b�y�k :" + max);
	}

}
