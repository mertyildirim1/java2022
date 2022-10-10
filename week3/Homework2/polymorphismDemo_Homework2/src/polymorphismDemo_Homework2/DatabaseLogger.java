package polymorphismDemo_Homework2;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to Database: " + message);
	}
}
