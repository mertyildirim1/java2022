package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number=1;
		int remainder = number % 2; //remainder --> kalan demektir.
		//System.out.println(remainder);

		boolean isPrime = true;
		
		//defansive programming
		
		if(number==1) {
			System.out.println("Sayý asal deðildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayý");
		}
		
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("Sayý asaldýr");
		}else {
			System.out.println("Sayý asal deðildir");
		}
	}

}
