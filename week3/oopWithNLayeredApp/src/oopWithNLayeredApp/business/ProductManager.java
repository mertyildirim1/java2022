package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) { // ba��ml�l�k enjeksiyonu
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// i� kurallar�
		if (product.getUnitPrice() < 10) {
			throw new Exception("�r�n fiyat� 10'dan k���k olamaz");
		}

		productDao.add(product); 		

		for (Logger logger : loggers) { // <db, mail>
			logger.log(product.getName());
		}
		
		// bir katman ba�ka bir katman�n class�n kullan�yokken sadece interfacesinden
		// eri�im kurmal�d�r.
		// entities ge�erli de�il ��nk� �zellik tutucu s�n�f onlar.

	}
}
