package youTubeDemo_;

public class Main {

	public static void main(String[] args) {
		// interface -- > genellikle i� yapan s�n�flar�n operayonlar�n� sadece imza seviyesinde yazarak yaz�l�mda ba��ml�l��� korumak ad�na yap�lan �al��mad�r
		// interfacelerin amac� yaz�lmdaki ba��ml�l�klar� engellemek iflerden kurtulmakt�r
	
		CustomerManager customerManager = new CustomerManager(new Person(), new TeacherCreditManager());
		customerManager.giveCredit();
	}
}
