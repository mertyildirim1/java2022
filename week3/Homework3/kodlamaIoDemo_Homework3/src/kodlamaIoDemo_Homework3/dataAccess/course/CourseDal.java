package kodlamaIoDemo_Homework3.dataAccess.course;

import java.util.List;

import kodlamaIoDemo_Homework3.entities.Course;

public interface CourseDal {
	List<Course> getAllCoursies();
	void addCourse(Course course);
}
