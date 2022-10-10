package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// sadece ve sadece db eriþim kodlarý buraya yazýlýr... SQL
		System.out.println("JDBC ile veritabanýna eklendi");
	}

}
