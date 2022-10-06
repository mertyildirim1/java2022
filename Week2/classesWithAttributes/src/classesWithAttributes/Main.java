package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Monster Abra A5", 7500, 3, "Siyah");
//		Product product = new Product();
//		product.setId(1);
//		product.setName("Laptop");
//		product.setPrice(7500);
//		product.set_description("Monster Abra A5");
//		product.setStockAmount(2);
//		product.setRenk("Siyah");

		System.out.println(product.getName());

		ProductManager productManager = new ProductManager();
		productManager.Ekle(product);

		System.out.println(product.getKod());

	}

}
