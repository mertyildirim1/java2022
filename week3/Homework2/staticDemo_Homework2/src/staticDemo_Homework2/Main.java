package staticDemo_Homework2;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.id = 1;
		product.name = "";
		product.price = 50;

		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
