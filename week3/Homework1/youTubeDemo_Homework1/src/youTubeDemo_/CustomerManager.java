package youTubeDemo_;

public class CustomerManager {
	private Customer _customer;
	private CreditDao _creditDao;

	public CustomerManager(Customer customer, CreditDao creditDao) {
		_customer = customer;
		_creditDao = creditDao;
	}

	public void save() {
		System.out.println("Müþteri kaydedildi: ");
	}

	public void delete() {
		System.out.println("Müþteri Silindi: ");
	}

	public void giveCredit() {
		_creditDao.conculate();
		System.out.println("Kredi verildi");
	}
}
