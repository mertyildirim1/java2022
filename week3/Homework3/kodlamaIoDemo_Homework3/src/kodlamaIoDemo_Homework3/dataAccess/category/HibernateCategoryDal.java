package kodlamaIoDemo_Homework3.dataAccess.category;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoDemo_Homework3.entities.Category;

public class HibernateCategoryDal implements CategoryDal {

	List<Category> categories = new ArrayList<Category>();
	@Override
	public void addCategory(Category category) {
		System.out.println("Hibernate ile veritabanýna eklendi: " + category);
		this.categories.add(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return categories;
	}

}
