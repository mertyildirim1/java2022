package kodlamaIoDemo_Homework3.entities;

import kodlamaIoDemo_Homework3.dataAccess.Entity;

public class Category implements Entity {
	
	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}

	private int id;
	private String categoryName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
