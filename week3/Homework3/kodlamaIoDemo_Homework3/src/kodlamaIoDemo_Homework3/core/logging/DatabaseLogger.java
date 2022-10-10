package kodlamaIoDemo_Homework3.core.logging;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Logged to Db: " + data);
		
	}

}
