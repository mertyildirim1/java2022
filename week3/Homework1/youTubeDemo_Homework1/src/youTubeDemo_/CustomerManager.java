package youTubeDemo_;

public class CustomerManager {
	private Customer _customer;
	private CreditDao _creditDao;

	public CustomerManager(Customer customer, CreditDao creditDao) {
		_customer = customer;
		_creditDao = creditDao;
	}

	public void save() {
		System.out.println("M��teri kaydedildi: ");
	}

	public void delete() {
		System.out.println("M��teri Silindi: ");
	}

	public void giveCredit() {
		_creditDao.conculate();
		System.out.println("Kredi verildi");
	}
}
