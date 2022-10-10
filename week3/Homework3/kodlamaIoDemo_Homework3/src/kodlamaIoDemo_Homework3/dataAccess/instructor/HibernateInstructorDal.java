package kodlamaIoDemo_Homework3.dataAccess.instructor;

import kodlamaIoDemo_Homework3.entities.Instructor;

public class HibernateInstructorDal implements InstructorDal {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritabanýna eklendi");

	}
}
