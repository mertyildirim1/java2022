package staticDemo_Homework2;

public class ProductValidator {

	static {
		System.out.println("Static Yap�c� blok �al��t� ");
	}

	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}

	public static boolean isValid(Product product) { // bir methodu static yapt���m�z zaman class ismi ile �a��r�l�r.
		if (product.price > 0 && !product.name.isEmpty()) { // isEmpty --> de�er girilmedi anlam�na gelir, bo�sa
			return true;
		} else {
			return false;
		}
	}
}
