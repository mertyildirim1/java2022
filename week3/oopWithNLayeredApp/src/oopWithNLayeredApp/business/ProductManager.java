package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) { // baðýmlýlýk enjeksiyonu
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// iþ kurallarý
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatý 10'dan küçük olamaz");
		}

		productDao.add(product); 		

		for (Logger logger : loggers) { // <db, mail>
			logger.log(product.getName());
		}
		
		// bir katman baþka bir katmanýn classýn kullanýyokken sadece interfacesinden
		// eriþim kurmalýdýr.
		// entities geçerli deðil çünkü özellik tutucu sýnýf onlar.

	}
}
