package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		// sadece ve sadece db eri�im kodlar� buraya yaz�l�... SQL
		System.out.println("Hibernate ile veritaban�na eklendi");
	}
	
}
