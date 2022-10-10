package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// sadece ve sadece db eriþim kodlarý buraya yazýlý... SQL
		System.out.println("Hibernate ile veritabanýna eklendi");
	}
	
}
