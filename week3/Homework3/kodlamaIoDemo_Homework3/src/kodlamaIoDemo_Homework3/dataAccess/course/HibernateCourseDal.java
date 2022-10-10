package kodlamaIoDemo_Homework3.dataAccess.course;

import java.util.ArrayList;
import java.util.List;

import kodlamaIoDemo_Homework3.entities.Course;

public class HibernateCourseDal implements CourseDal {
	private List<Course> coursies = new ArrayList<Course>();

	@Override
	public void addCourse(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi");
		this.coursies.add(course);
	}

	@Override
	public List<Course> getAllCoursies() {

		return coursies;
	}
}
