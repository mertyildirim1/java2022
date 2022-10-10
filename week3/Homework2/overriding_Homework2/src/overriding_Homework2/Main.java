package overriding_Homework2;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
			
			System.out.println(baseKrediManager.hesapla(500));
		}
	}

}
