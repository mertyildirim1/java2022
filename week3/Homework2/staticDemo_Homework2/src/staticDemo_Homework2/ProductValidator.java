package staticDemo_Homework2;

public class ProductValidator {

	static {
		System.out.println("Static Yapýcý blok çalýþtý ");
	}

	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}

	public static boolean isValid(Product product) { // bir methodu static yaptýðýmýz zaman class ismi ile çaðýrýlýr.
		if (product.price > 0 && !product.name.isEmpty()) { // isEmpty --> deðer girilmedi anlamýna gelir, boþsa
			return true;
		} else {
			return false;
		}
	}
}
