package youTubeDemo_;

public class Main {

	public static void main(String[] args) {
		// interface -- > genellikle iþ yapan sýnýflarýn operayonlarýný sadece imza seviyesinde yazarak yazýlýmda baðýmlýlýðý korumak adýna yapýlan çalýþmadýr
		// interfacelerin amacý yazýlmdaki baðýmlýlýklarý engellemek iflerden kurtulmaktýr
	
		CustomerManager customerManager = new CustomerManager(new Person(), new TeacherCreditManager());
		customerManager.giveCredit();
	}
}
