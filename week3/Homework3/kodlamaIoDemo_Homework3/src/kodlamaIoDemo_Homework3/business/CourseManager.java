package kodlamaIoDemo_Homework3.business;

import java.util.List;

import kodlamaIoDemo_Homework3.core.logging.Logger;
import kodlamaIoDemo_Homework3.dataAccess.course.CourseDal;
import kodlamaIoDemo_Homework3.entities.Course;

public class CourseManager {
	private CourseDal _courseDal;
	private List<Logger> _loggers;

	public CourseManager(CourseDal courseDal, List<Logger> loggers) {
		this._courseDal = courseDal;
		this._loggers = loggers;

	}

	public void add(Course course) throws Exception {

		List<Course> coursies = _courseDal.getAllCoursies();
		boolean isThere = false;
		for (Course course2 : coursies) {
			if (course.getCourseName().equals(course2.getCourseName())) {
				isThere = true;
				break;
			}
		}

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatý 0'dan küçük olamaz");
		} else if (!isThere && !(course.getPrice() < 0)) {
			_courseDal.addCourse(course);
			for (Logger logger : _loggers) {
				logger.log("Kurs Eklendi, " + course.getCourseName());
			}
		} else {
			throw new Exception("Kurs ismi tekrar edemez");
		}

	}

	public void listele(List<Course> coursies) {
		System.out.println("\n---------Kurslar Listelendi---------\n");
		for (Course course : coursies) {
			System.out.println(course.getCourseName());
		}
	}
}
