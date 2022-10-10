package kodlamaIoDemo_Homework3.dataAccess.category;

import java.util.List;

import kodlamaIoDemo_Homework3.entities.Category;

public interface CategoryDal {

	List<Category> getAllCategories();
	void addCategory(Category category);

}
