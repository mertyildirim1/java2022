package kodlamaIoDemo_Homework3.dataAccess.category;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoDemo_Homework3.entities.Category;

public class JdbcCategoryDal implements CategoryDal {
	List<Category> categories = new ArrayList<Category>();

	@Override
	public void addCategory(Category category) {
		System.out.println("Jdbc ile veritabanưna eklendi");
		this.categories.add(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return categories;
	}
}
