package classesWithAttributes;

public class Product {

	public Product(int id, String name, String descripting, double price, int stockAmount, String renk) {
		System.out.println("Yapýcý blok çalýþtý");
		this.id = id;
		this.name = name;
		this.description = descripting;
		this.price = price;
		this.renk = renk;
		this.stockAmount = stockAmount;
	}

	// Overloading - aþýrý yükleme
	public Product() {

	}

	// Attribute | field
	int id; // id, ürünü tanýmlayan eþsiz deðerdir.
	String name;
	String description;
	double price;
	int stockAmount;
	String renk;
	String kod;

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getId() { // read only
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getKod() {
		return this.name.substring(0, 1) + id;
	}

}
