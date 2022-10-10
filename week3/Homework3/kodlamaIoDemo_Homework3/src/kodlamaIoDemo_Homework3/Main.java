package kodlamaIoDemo_Homework3;

import java.util.ArrayList;

import kodlamaIoDemo_Homework3.business.CategoryManager;
import kodlamaIoDemo_Homework3.business.CourseManager;
import kodlamaIoDemo_Homework3.business.InstructorManager;
import kodlamaIoDemo_Homework3.core.logging.DatabaseLogger;
import kodlamaIoDemo_Homework3.core.logging.FileLogger;
import kodlamaIoDemo_Homework3.core.logging.Logger;
import kodlamaIoDemo_Homework3.dataAccess.category.CategoryDal;
import kodlamaIoDemo_Homework3.dataAccess.category.HibernateCategoryDal;
import kodlamaIoDemo_Homework3.dataAccess.category.JdbcCategoryDal;
import kodlamaIoDemo_Homework3.dataAccess.course.CourseDal;
import kodlamaIoDemo_Homework3.dataAccess.course.HibernateCourseDal;
import kodlamaIoDemo_Homework3.dataAccess.instructor.HibernateInstructorDal;
import kodlamaIoDemo_Homework3.entities.Category;
import kodlamaIoDemo_Homework3.entities.Course;
import kodlamaIoDemo_Homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		ArrayList<Logger> loggers = new ArrayList<Logger>();
		loggers.add(new FileLogger());
//		loggers.add(new DatabaseLogger());
//		loggers.add(new MailLogger());
		Instructor instructor1 = new Instructor(1, "Engin", "Demiroð");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDal(), loggers);
		instructorManager.add(instructor1);

		System.out.println("-------Kategori-------\n");

		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Mobil Programlama");
		Category category3 = new Category(3, "Yapay zeka");

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDal(), loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);// eðer eklediðimiz iki kategorinin de ismi ayný ise hata verecektir

		System.out.println("\n-------Kurs-------\n");

		Course course1 = new Course(1, "(2022) Yazýlým Geliþtirici Yetiþtirme Kampý - JAVA", 70.0);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA - REACT)", 75.0);
		Course course3 = new Course(3, "Senior Yazýlým Geliþtirici Yetiþtirme Kampý (.NET)", 119.90);
		Course course4 = new Course(4, "Yazýlým Geliþtirici Yetiþtirme Kampý (JavaScript)", 55.0);
		Course course5 = new Course(5, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# - ANGULAR)", 70.90);

		ArrayList<Course> coursies = new ArrayList<Course>();
		coursies.add(course1);
		coursies.add(course2);
		coursies.add(course3);
		coursies.add(course4);
		coursies.add(course5);

		CourseManager courseManager = new CourseManager(new HibernateCourseDal(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);

		// courseManager.listele(coursies);

	}

}
