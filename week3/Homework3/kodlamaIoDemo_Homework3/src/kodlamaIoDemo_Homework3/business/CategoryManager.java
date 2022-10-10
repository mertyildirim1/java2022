package kodlamaIoDemo_Homework3.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoDemo_Homework3.core.logging.Logger;
import kodlamaIoDemo_Homework3.dataAccess.category.CategoryDal;
import kodlamaIoDemo_Homework3.entities.Category;

public class CategoryManager {

	private CategoryDal _categoryDal;
	private List<Logger> _loggers;

	public CategoryManager(CategoryDal categoryDal, List<Logger> logger) {
		this._loggers = logger;
		this._categoryDal = categoryDal;
	}

	public void add(Category category) throws Exception {
		List<Category> categories = _categoryDal.getAllCategories();
		boolean isThere = false;
		for (Category category2 : categories) {
			if (category.getCategoryName().equals(category2.getCategoryName())) {
				isThere = true;
				break;
			}
		}
		if (!isThere) {
			_categoryDal.addCategory(category);
			for (Logger logger : _loggers) {
				logger.log("Kategori oluþturuldu, " + 	category.getCategoryName());
			}

		}else {
			throw new Exception("Kategori ismi tekrar edemez!");
		}

	}
}
