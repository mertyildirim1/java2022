package kodlamaIoDemo_Homework3.business;

import java.util.List;

import kodlamaIoDemo_Homework3.core.logging.Logger;
import kodlamaIoDemo_Homework3.dataAccess.instructor.InstructorDal;
import kodlamaIoDemo_Homework3.entities.Instructor;

public class InstructorManager {

	private InstructorDal żnstructorDal;
	private List<Logger> loggers;

	public InstructorManager(InstructorDal inInstructorDal, List<Logger> loggers) {
		this.żnstructorDal = inInstructorDal;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		żnstructorDal.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName() + " " + instructor.getLastName());
		}
	}

}
