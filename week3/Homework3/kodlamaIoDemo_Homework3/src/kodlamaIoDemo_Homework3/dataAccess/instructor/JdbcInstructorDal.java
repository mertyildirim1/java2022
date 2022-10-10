package kodlamaIoDemo_Homework3.dataAccess.instructor;

import kodlamaIoDemo_Homework3.entities.Instructor;

public class JdbcInstructorDal implements InstructorDal{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanýna eklendi");
		
	}

}
