package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(8);
		product2.setUnitPrice(4500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setDiscount(6);
		product3.setUnitPrice(6500);
		product3.setUnitsInStock(4);
		product3.setImageUrl("image3.jpg");

		Product[] products = new Product[] { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName() + "\n" + product.getDiscount());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05555555555");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstname("Mert");
		individualCustomer.setLastName("Yýldýrým");

		CorparateCustomer corparateCustomer = new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCompanyName("Kodlama.io");
		corparateCustomer.setPhoneNumber("05353534785");
		corparateCustomer.setTaxNumber("11111111111");
		corparateCustomer.setCustomerNumber("54321");

		Customer[] customers = { individualCustomer, corparateCustomer };
		

	}

}
